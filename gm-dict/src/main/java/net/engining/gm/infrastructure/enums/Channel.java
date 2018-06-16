package net.engining.gm.infrastructure.enums;

import net.engining.pg.support.meta.EnumInfo;

@EnumInfo({
	"CUP|银联渠道",
	"CSS|客服",
	"IVR|电话银行",
	"INB|网上银行",
	"MPB|手机银行",
	"ITR|内部管理",
	"BNK|行内综合",
	"TLR|柜面渠道",
	"ATM|ATM渠道"
})
/**
 *  卡管接入渠道
 */
public enum Channel{
	/**
	 * 银联
	 */
	CUP, 
	/**
	 * 客服
	 */
	CSS,
	/**
	 * 电话银行
	 */
	IVR,
	/**
	 * 网上银行
	 */
	INB,
	/**
	 * 手机银行
	 */
	MPB,
	/**
	 * 内部管理
	 */
	ITR,
	/**
	 * 行内综合
	 */
	BNK,
	/**
	 * 柜面渠道
	 */
	TLR,
	/**
	 * ATM渠道
	 */
	ATM
}