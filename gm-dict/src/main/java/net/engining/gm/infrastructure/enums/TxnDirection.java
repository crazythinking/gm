package net.engining.gm.infrastructure.enums;

import net.engining.pg.support.meta.EnumInfo;

@EnumInfo({
	"D|借方", 
	"C|贷方",
	"O|其他(查询等)"
})

public enum TxnDirection {
	/**
	 *	 借方
	 */
	D, 
	/**
	 * 	贷方
	 */
	C,
	/**
	 *  其他交易(查询等)
	 */
	O
}
