package net.engining.gm.infrastructure.enums;

import net.engining.pg.support.meta.EnumInfo;

/**
 * 卡品牌
 */
@EnumInfo({
	"V|VISA",
	"M|MASTER CARD",
	"J|JCB",
	"C|CUP"
})
public enum Brand{
	/**
	 * VISA 
	 */
	V("VISA"),
	/**
	 * MASTERCARD
	 */
	M("MASTERCARD"),
	/**
	 * JCB
	 */
	J("JCB"),
	/**
	 * CUP
	 */
	C("CUP");
	
	private String  brand;

	private Brand(String brand)
	{
		this.brand = brand;
	}

	public String getBrand() {
		return brand;	
	}
}