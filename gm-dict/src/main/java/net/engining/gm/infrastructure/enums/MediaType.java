package net.engining.gm.infrastructure.enums;

import net.engining.pg.support.meta.EnumInfo;

/**
 * 卡面介质类型
 */
@EnumInfo({ "I|芯片卡","B|芯片磁条复合卡" })
public enum MediaType {
	/**
	 * 芯片卡
	 */
	I,
	/**
	 * 芯片磁条复合卡
	 */
	B
}