package net.engining.gm.infrastructure.enums;

import net.engining.pg.support.meta.EnumInfo;

@EnumInfo({
	"CC|虚拟信用卡",
	"BL|小额贷款",
	"EC|专项活期",
	"PI|活期存款",
	"FT|定期存款",
	"ID|智能存款"
})
public enum BusinessType {

	/**
	 * 虚拟信用卡(循环信用贷款)
	 */
	CC,
	/**
	 * 小额贷款
	 */
	BL,
	/**
	 * 专项活期(电子现金)
	 */
	EC,
	/**
	 * 活期存款
	 */
	PI,
	/**
	 * 定期存款
	 */
	FT,
	/**
	 * 智能存款
	 */
	ID
}
