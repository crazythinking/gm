package net.engining.gm.infrastructure.enums;

import net.engining.pg.support.meta.EnumInfo;

/**
 * 房屋类型
 * @author Ronny
 *
 */
@EnumInfo({
	"A|经济适用住房",
	"B|廉租房",
	"C|房改房",
	"D|安居房",
	"E|集资房",
	"F|商品房",
	"G|限价房",
	"H|别墅",
	"I|商铺",
	"Z|其他"
})
public enum HouseType {

	/**
	 *	经济适用住房
	 */
	A,
	/**
	 *	廉租房
	 */
	B,
	/**
	 *  房改房
	 */
	C,
	/**
	 * 	安居房
	 */
	D,
	/**
	 * 	集资房
	 */
	E,
	/**
	 *  商品房
	 */
	F,
	/**
	 *  限价房
	 */
	G,
	/**
	 *  别墅
	 */
	H,
	/**
	 *  商铺
	 */
	I,
	/**
	 *  其他
	 */
	Z
}
