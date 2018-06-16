package net.engining.gm.infrastructure.enums;

import net.engining.pg.support.meta.EnumInfo;


/**
 * 周期间隔
 * @author Ronny
 *
 */
@EnumInfo({
	"D|日",
	"W|周",
	"M|月",
	"Y|年"
})
public enum Interval {

	/**
	 * 日
	 */
	D,
	/**
	 * 周
	 */
	W,
	/**
	 * 月
	 */
	M,
	/**
	 * 年
	 */
	Y
}
