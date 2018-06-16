package net.engining.gm.facility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import net.engining.gm.infrastructure.enums.SystemStatusType;
import net.engining.gm.param.model.SystemStatus;
import net.engining.pg.parameter.ParameterFacility;

/**
 * 用于系统批量处理日切状态的封装类
 * @author luxue
 *
 */
public class SystemStatusFacility {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public static final String BATCH_DATE_PATTERN = "yyyyMMdd";

	@Autowired
	private ParameterFacility parameterXStreamFacility;

	public SystemStatus getSystemStatus() {
		return parameterXStreamFacility.loadUniqueParameter(SystemStatus.class);
	}
	
	public void nextBatchSeq(){
		// 处理日切逻辑
		SystemStatus status = getSystemStatus();
		int lastSeq = status.batchSeq;
		status.batchSeq = status.batchSeq+1;
		try {
			parameterXStreamFacility.updateParameter(ParameterFacility.UNIQUE_PARAM_KEY, status);
		} catch (Exception e) {
			throw new RuntimeException("参数不存在");
		}
		
		logger.info("进行系统BatchSeq递增操作，从[{}]递增到[{}]", lastSeq, status.batchSeq);
	}

	public void doDateSwitch(Date nextProcessDate) {
		// 处理日切逻辑
		SystemStatus status = getSystemStatus();

		nextProcessDate = DateUtils.truncate(nextProcessDate, Calendar.DATE);
		if (nextProcessDate.compareTo(status.processDate) <= 0)
			throw new IllegalArgumentException("新处理日期不正确");

		status.lastProcessDate = status.processDate;
		status.processDate = nextProcessDate;
		status.businessDate = DateUtils.addDays(nextProcessDate, 1);
		status.systemStatus = SystemStatusType.B;//系统状态改为批量状态
		
		try {
			parameterXStreamFacility.updateParameter(ParameterFacility.UNIQUE_PARAM_KEY, status);
		} catch (Exception e) {
			throw new RuntimeException("参数不存在");
		}
		logger.info("进行系统日切，从[{}]切换到[{}]", status.processDate, status.businessDate);
	}
	
	/**
	 * 系统状态改为非批量状态
	 */
	public void changeSystemStatus() {
		 
		SystemStatus status = getSystemStatus();
		status.systemStatus = SystemStatusType.N;
		try {
			parameterXStreamFacility.updateParameter(ParameterFacility.UNIQUE_PARAM_KEY, status);
		} catch (Exception e) {
			throw new RuntimeException("参数不存在");
		}
	 
	}
	
	public String getFormattedBusinessDate()
	{
		return new SimpleDateFormat(BATCH_DATE_PATTERN).format(getSystemStatus().businessDate);
	}
	public String getFormattedProcessDate()
	{
		return new SimpleDateFormat(BATCH_DATE_PATTERN).format(getSystemStatus().processDate);
	}
	public String getFormattedLastProcessDate()
	{
		return new SimpleDateFormat(BATCH_DATE_PATTERN).format(getSystemStatus().lastProcessDate);
	}
	
	public SystemStatusType getNowSystemStatus()
	{
		return  getSystemStatus().systemStatus;
	}

}
