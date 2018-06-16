package net.engining.gm.infrastructure.enums;

import net.engining.pg.support.meta.EnumInfo;

/**
 * 授信类型
 * @author guopy
 * @date 2012-8-10 上午11:28:54
 */
@EnumInfo({ 
	"P|循环授信", 
	"O|一次性授信" 
	})
public enum AuthType {
	/**
	 * 循环授信
	 */
	P, 
	/**
	 * 一次性授信
	 */
	O
}