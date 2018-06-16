package net.engining.gm.infrastructure.enums;

import net.engining.pg.support.meta.EnumInfo;

/**
 * 风险类别
 * @author Ronny
 *
 */
@EnumInfo({
	"N|普通",
	"M|中风险",
	"F|高风险"

})
public enum SocialStatus {

	/**
	 *	普通 
	 */
	N,
	/**
	 *	中风险 
	 */
	M,
	/**
	 *	高风险 
	 */
	F

}
