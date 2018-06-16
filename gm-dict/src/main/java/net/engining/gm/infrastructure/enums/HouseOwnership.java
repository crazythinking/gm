package net.engining.gm.infrastructure.enums;

import net.engining.pg.support.meta.EnumInfo;

/**
 * 房屋持有类型
 * @author Ronny
 *
 */
@EnumInfo({
	"A|自有住房（无贷款）",
	"B|贷款购房",
	"C|租房",
	"D|与亲属合住",
	"E|集体宿舍",
	"Z|其他"
})
public enum HouseOwnership {
	
	/**
	 *	自有住房（无贷款）
	 */
	A,
	/**
	 *	贷款购房
	 */
	B,
	/**
	 *	租房
	 */
	C,
	/**
	 *	与亲属合住
	 */
	D,
	/**
	 *	集体宿舍
	 */
	E,
	/**
	 *	其他
	 */
	Z
}
