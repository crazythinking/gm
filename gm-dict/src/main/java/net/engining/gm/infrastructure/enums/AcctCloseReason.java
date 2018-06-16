package net.engining.gm.infrastructure.enums;

import net.engining.pg.support.meta.EnumInfo;

/**
 * 关闭账户原因
 * @author yinxia
 *
 */
@EnumInfo({
	"R00|成功",
	"R01|账户余额非零",
	"R02|未达借记金额非0",
	"R03|未达贷记金额非0",
	"R11|账户外币余额非0",
	"R12|外币未达借记金额非0",
	"R13|外币未达贷记金额非0",
	"R99|其他账户类型关闭失败"
})
public enum AcctCloseReason
{
	/**
	 * 成功
	 */
	R00("成功"),
	/**
	 * 账户余额非零
	 */
	R01("账户余额非零"),
	/**
	 * 未达借记金额非0
	 */
	R02("未达借记金额非0"),
	/**
	 * 未达贷记金额非0
	 */
	R03("未达贷记金额非0"),
	/**
	 * 账户外币余额非0
	 */
	R11("账户外币余额非0"),
	/**
	 * 外币未达借记金额非0
	 */
	R12("外币未达借记金额非0"),
	/**
	 * 外币未达贷记金额非0
	 */
	R13("外币未达贷记金额非0"),
	/**
	 * 其他账户类型关闭失败
	 */
	R99("其他账户类型关闭失败")
	;
	
	private String desc; 
	
	private AcctCloseReason(String desc)
	{
		this.desc = desc;
	}
	public String getDesc() {
		return desc;
	}
}
