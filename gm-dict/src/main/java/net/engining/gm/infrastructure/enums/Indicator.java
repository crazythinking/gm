package net.engining.gm.infrastructure.enums;

import net.engining.pg.support.meta.EnumInfo;

/**
 * 状态标志
 * @author Ronny
 *
 */
@EnumInfo({
	"Y|是",
	"N|否",
	"U|未知"
})
public enum Indicator {
	/**
	 * 是
	 */
	Y,
	/**
	 * 否
	 */
	N,
	/**
	 * 未知
	 */
	U
}
