package net.engining.gm.infrastructure.enums;

import net.engining.pg.support.meta.EnumInfo;

/**
 * 授权决定
 */
@EnumInfo({
	"A|批准",
	"D|拒绝",
	"P|没收",
	"C|电话联系"
})
public enum ActionCode {
	/**
	 * 批准
	 */
	A, 
	/**
	 * 拒绝
	 */
	D,
	/**
	 * 没收
	 */
	P,
	/**
	 * 照会
	 */
	C;

}
