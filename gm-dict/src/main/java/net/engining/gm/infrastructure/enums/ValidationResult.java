package net.engining.gm.infrastructure.enums;

import net.engining.pg.support.meta.EnumInfo;

/**
 * 验证结果
 * @author Ronny
 *
 */
@EnumInfo({
	"V01|验证成功",
	"V02|验证失败",
	"V03|未做检验"
})
public enum ValidationResult {
	/**
	 * 验证成功
	 */
	V01,
	/**
	 * 验证失败
	 */
	V02,
	/**
	 * 未做检验
	 */
	V03
}
