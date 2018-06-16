package net.engining.gm.infrastructure.enums;

import net.engining.pg.support.meta.EnumInfo;

/**
 * 输入输出方向
 * @author Xubo
 *
 */
@EnumInfo({
	"I|输入",
	"O|输出",
	"B|双向",
	"E|其它"
})
public enum Direction {

	/**
	 *	输入 Input 
	 */
	I,
	/**
	 *	输出 Output 
	 */
	O,
	/**
	 *	双向 Bothway
	 */
	B,
	/**
	 *	其它 Else
	 */
	E
}