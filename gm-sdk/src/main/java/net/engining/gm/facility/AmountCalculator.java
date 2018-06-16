package net.engining.gm.facility;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 金额计算工具类
 * @author Ronny
 *
 */
@Deprecated
public class AmountCalculator {

	/**
	 * 根据有效期，合并金额<br>
	 * if (processDate>= startDate <br>
	 * 		and processDate <= endDate) <br>
	 * 	return originalAmount + potentialAmount<br>
	 * else <br>
	 *  return originalAmount<br>
	 * @param originalAmount 原始金额，不可为空
	 * @param potentialAmount 附加金额，可为空
	 * @param processDate 当前日期
	 * @param startDate 附加起始日期
	 * @param endDate 附加结束日期
	 * @return
	 */
	public static BigDecimal sumAmountByTime(BigDecimal originalAmount, BigDecimal potentialAmount, Date processDate, Date startDate, Date endDate){
		BigDecimal b = BigDecimal.ZERO;
		if (originalAmount != null)
			b = originalAmount;
		
		if (startDate != null && endDate != null
			&& processDate.compareTo(startDate) >= 0 
			&& processDate.compareTo(endDate) <= 0)
		{
			b = b.add(potentialAmount);
		}
		return b;
	}
}
