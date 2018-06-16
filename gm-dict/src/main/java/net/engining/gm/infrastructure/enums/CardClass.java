package net.engining.gm.infrastructure.enums;

import net.engining.pg.support.meta.EnumInfo;

/**
 * 卡等级，这里按级别高低排序
 */
@EnumInfo({
	"G|金卡",
	"P|白金卡",
	"D|钻石卡",
})
public enum CardClass{
	/**
	 *	金卡
	 */
	G("GOLD"),
	/**
	 *	白金卡 
	 */
	P("PLTM"),
	/**
	 *	钻石卡 
	 */
	D("DIAM");
	private String fullName;
	private CardClass(String fullName){
		this.fullName = fullName;
	}
	public String getFullName(){
		return this.fullName;
	}
}