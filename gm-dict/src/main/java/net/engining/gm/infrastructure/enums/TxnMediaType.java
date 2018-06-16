package net.engining.gm.infrastructure.enums;

import net.engining.pg.support.meta.EnumInfo;

/**
 * 交易介质类型
 */
@EnumInfo({ "I|芯片卡", "M|磁条卡" })
public enum TxnMediaType {
	/**
	 * 芯片卡
	 */
	I,
	/**
	 * 磁条卡
	 */
	M,
}