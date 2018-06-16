package net.engining.gm.infrastructure.enums;

import net.engining.pg.support.meta.EnumInfo;

/**
 * 总账入账方式
 * @author Ronny & heyu.wang
 *
 */
@EnumInfo({
	"N|正常入账交易",
	"S|挂账交易",
	"W|核销交易"
})
public enum PostGlIndicator {

	/**
	 *	正常入账交易 
	 */
	N,
	/**
	 *	挂账交易 
	 */
	S,
	/**
	 *	核销交易 
	 */
	W
}