package net.engining.gm.infrastructure.enums;

import net.engining.pg.support.meta.EnumInfo;


/**
 * 主附卡标识
 * @author Ronny
 *
 */
@EnumInfo({
	"B|主卡",
	"S|附卡",
	"C|为开卡"
})
public enum BscSuppInd {
	/**
	 *	主卡 
	 */
	B,
	/**
	 *	附卡 
	 */
	S,
	/**
	 *	未开卡 
	 */
	N
}
