package net.engining.gm.param.model;

import java.io.Serializable;
import java.math.BigDecimal;

import net.engining.pg.support.meta.PropertyInfo;

public class CurrencyCd implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 币种数字代码
	 */
	@PropertyInfo(name="数字代码", length=3)
	public String currencyCd;
	
	/**
	 * 币种英文代码
	 */
	@PropertyInfo(name="英文代码", length=3)
	public String alphaCd;

	/**
     * 描述
     */
    @PropertyInfo(name="描述", length=20)
    public String description;
	
	/**
	 * 币种保留小数位数
	 */
	@PropertyInfo(name="小数位数", length=1)
	public Integer exponent;
	
	/**
     * 折算本币汇率
     * 用于购汇和账务计算的汇率
     */
    @PropertyInfo(name="兑换汇率", length=9, precision=4)
    public BigDecimal conversionRt;
    
    /**
     * 基准本币汇率
     * 用于授权时可用额度控制
     */
    @PropertyInfo(name="基准汇率", length=9, precision=4)
    public BigDecimal baseRt;
}
