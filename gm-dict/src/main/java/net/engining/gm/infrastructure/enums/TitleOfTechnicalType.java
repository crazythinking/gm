package net.engining.gm.infrastructure.enums;

import net.engining.pg.support.meta.EnumInfo;

@EnumInfo({
	"A|高级及以上",
	"B|中级",
	"C|初级",
	"D|初级以下"
})
/*
 * 申请人职称
 */
public enum TitleOfTechnicalType {

	/**
	 * 高级及以上
	 */
	A("高级及以上"),
	/**
	 * 中级
	 */
	B("中级"),
	/**
	 * 初级
	 */
	C("初级"),
	/**
	 * 初级以下
	 */
	D("初级以下")
	;
	
	private String desc;
	
	public String getDesc() {
		return desc;
	}

	private TitleOfTechnicalType(String desc){
		this.desc = desc;
	}
	
}