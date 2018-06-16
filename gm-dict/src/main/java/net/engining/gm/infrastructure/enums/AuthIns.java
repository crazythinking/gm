package net.engining.gm.infrastructure.enums;

import net.engining.pg.support.meta.EnumInfo;

/**
 * 处理中心
 * 银联报文61.4域
 * @author Ronny
 *
 */
@EnumInfo({
	"CUP|银联",
	"VIS|VISA",
	"MCC|MasterCard"
})
public enum AuthIns {

	CUP,
	VIS,
	MCC
}
