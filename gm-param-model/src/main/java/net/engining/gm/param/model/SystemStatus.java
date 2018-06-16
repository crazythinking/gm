package net.engining.gm.param.model;

import java.io.Serializable;
import java.util.Date;

import net.engining.gm.infrastructure.enums.SystemStatusType;
import net.engining.pg.support.meta.PropertyInfo;

/**
 * 全局联机日期、全局批量日期
 * 
 * @author zhangkun
 *
 */
public class SystemStatus implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 联机日期
	 */
	@PropertyInfo(name="联机日期", length=8)
	public Date businessDate;

	/**
	 * 批量日期
	 */
	@PropertyInfo(name="批量日期", length=8)
	public Date processDate;

	/**
	 * 最后批量日期
	 */
	@PropertyInfo(name="最后批量日期", length=8)
	public Date lastProcessDate;
	
	/**
	 * 当前系统状态
	 * N=非批量状态
	 * B=批量状态
	 */
	@PropertyInfo(name="当前系统状态", length=1)
	public SystemStatusType systemStatus;
	
	/**
	 * 当前系统批次执行序号
	 */
	public int batchSeq;
	
}
