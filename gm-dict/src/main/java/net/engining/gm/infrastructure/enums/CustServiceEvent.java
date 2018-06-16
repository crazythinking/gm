package net.engining.gm.infrastructure.enums;

import net.engining.pg.support.meta.EnumInfo;

/**
 * 客服事件
 * @author Ronny
 *
 */
@EnumInfo({
	"C01|重置交易密码",
	"C02|重置交易密码锁定",
	"C03|换卡",
	"C04|卡挂失",
	"A01|补打对账单"
})
public enum CustServiceEvent {
	/**
	 * 重置交易密码
	 */
	C01,
	/**
	 * 重置交易密码锁定
	 */
	C02,
	/**
	 * 换卡
	 */
	C03,
	/**
	 * 卡挂失
	 */
	C04,
	/**
	 * 补打对账单
	 */
	A01
	;
}
