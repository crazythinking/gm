package net.engining.gm.infrastructure.enums;

import net.engining.pg.support.meta.EnumInfo;

/**
 * 账单介质类型
 * @author Ronny
 *
 */
@EnumInfo({
	"P|纸质账单",
	"E|电子账单",
	"B|both"
})
public enum StmtMediaType {

	/**
	 *	纸质账单 
	 */
	P,
	/**
	 *	电子账单 
	 */
	E,
	/**
	 *	both 
	 */
	B
}