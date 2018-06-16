package net.engining.gm.infrastructure.enums;

import net.engining.pg.support.meta.EnumInfo;

/**
 * 寄送方式
 * @author Ronny
 *
 */
@EnumInfo({
	"A|邮件寄送",
	"B|分行领卡"
})
public enum FetchMethod {
	/**
	 *	邮件寄送 
	 */
	A,
	/**
	 *	分行领卡 
	 */
	B
}
