package net.engining.gm.infrastructure.enums;

import net.engining.pg.support.meta.EnumInfo;

/**
 * 个人资产类型
 * @author Ronny
 *
 */
@EnumInfo({
	"A|小于10万",
	"B|10万-20万",
	"C|20万-50万",
	"D|50万-100万",
	"E|大于100万"
})
public enum LiquidAsset {

	/**
	 *	少于10万
	 */
	A,
	/**
	 *	10万-20万
	 */
	B,
	/**
	 *	20万-50万
	 */
	C,
	/**
	 *	50万-100万
	 */
	D,
	/**
	 *	大于100万
	 */
	E
}
