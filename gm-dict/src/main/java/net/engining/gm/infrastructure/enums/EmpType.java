package net.engining.gm.infrastructure.enums;

import net.engining.pg.support.meta.EnumInfo;

@EnumInfo({
	"A|公共管理与社会组织",
	"B|科研文化卫生教育",
	"C|金融电力电信",
	"D|邮政交通运输公用",
	"E|计算机服务与软件业",
	"F|体育娱乐",
	"G|工业商业服务业贸易",
	"H|其他"
})
/*
 * 公司行业类别
 */
public enum EmpType {

	/**
	 * 公共管理与社会组织
	 */
	A,
	/**
	 * 科研文化卫生教育
	 */
	B,
	/**
	 * 金融电力电信
	 */
	C,
	/**
	 * 邮政交通运输公用
	 */
	D,
	/**
	 * 计算机服务与软件业
	 */
	E,
	/**
	 * 体育娱乐
	 */
	F,
	/**
	 * 工业商业服务业贸易
	 */
	G,
	/**
	 * 其他
	 */
	H
}