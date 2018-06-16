package net.engining.gm.param.model;

import java.io.Serializable;
import java.math.BigDecimal;

import net.engining.pg.support.meta.PropertyInfo;

/**
 * 利息税
 * @author Ronny
 *
 */
public class IntTaxRate implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 币种数字代码
	 */
	@PropertyInfo(name="货币代码", length=3)
	public String currencyCd;

	 /**
     * 是否代扣利息税
     */
    @PropertyInfo(name="代扣利息税", length=1)
	public Boolean withHoldingInt;
    
	/**
     * 折算本币汇率
     * 用于购汇和账务计算的汇率
     */
    @PropertyInfo(name="税率", length=9, precision=4)
    public BigDecimal taxRt;
    
}
