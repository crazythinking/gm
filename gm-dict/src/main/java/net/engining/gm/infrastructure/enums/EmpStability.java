package net.engining.gm.infrastructure.enums;

import net.engining.pg.support.meta.EnumInfo;

/**
 * 工作稳定性
 * @author Ronny
 *
 */
@EnumInfo({
	"A|很稳定",
	"B|基本稳定",
	"C|不稳定"
})
public enum EmpStability {

	/**
	 *	很稳定
	 */
	A,
	/**
	 *	基本稳定
	 */
	B,
	/**
	 *	不稳定
	 */
	C
}
