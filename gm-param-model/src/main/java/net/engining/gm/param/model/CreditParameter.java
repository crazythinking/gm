package net.engining.gm.param.model;

import java.io.Serializable;

import net.engining.pg.support.meta.PropertyInfo;

public class CreditParameter implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
     * 预销卡持续天数
     * 销卡账户保留多少天后正式销卡
     */
    @PropertyInfo(name="预销卡持续天数", length=2)
    public Integer daysBeforeClose;
}
