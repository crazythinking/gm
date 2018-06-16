package net.engining.gm.infrastructure.enums;

import net.engining.pg.support.meta.EnumInfo;

/**
 * 交易群组
 * @author Ronny
 *
 */
@EnumInfo({
	"MEM|MEMO交易",
	"FIN|金融交易",
	"NOF|非金融交易",
	"OTH|其他交易"
})
public enum TxnCategory {

	/**
	 * MEMO交易
	 */
	MEM,
	/**
	 * 金融交易
	 */
	FIN,
	/**
	 * 非金融交易
	 */
	NOF,
	/**
	 * 其他交易
	 */
	OTH
}
