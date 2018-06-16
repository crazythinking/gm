package net.engining.gm.infrastructure.enums;

import net.engining.pg.support.meta.EnumInfo;

/**
 * 交易类别
 * @author Ronny
 *
 */
@EnumInfo({
	"Normal|正常-00",
	"Reversal|冲正-01",
	"Void|撤销-02",
	"VoidReversal|撤销的冲正-03",
	"Advice|通知-04",
	"Confirm|确认-05",
	"Query|查询-06",
	"PreAuth|预授权-07",
	"ConfVoidReversal|预授权完成撤销冲正-08"
})
public enum TxnType {
    /**
	 * 正常 - 00
	 */
	Normal,	
	/**
	 * 冲正 - 01
	 */
	Reversal,
	/**
	 * 撤销 - 02
	 */
	Void,
	/**
	 * 撤销的冲正 - 03
	 */
	VoidReversal,
    /**
     * 通知 - 04
     */
    Advice,
    /**
     * 确认 - 05
     */
    Confirm,
    /**
     * 查询 - 06
     */
    Query,
	/**
	 * 预授权 - 07
	 */
	PreAuth,
	/**
	 * 预授权完成撤销冲正 - 08
	 */
	ConfVoidReversal;
}
