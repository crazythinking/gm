package net.engining.gm.param.model;

import java.io.Serializable;

import net.engining.pg.support.meta.PropertyInfo;

/**
 * 产品参数的基类，各模块的产品相关参数通过扩展此类实现
 * 
 * @author zhangkun
 *
 */
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 产品代码
	 */
	@PropertyInfo(name = "产品代码", length = 30)
	public String productCode;
	
	/**
	 * 产品描述
	 */
	@PropertyInfo(name = "产品描述", length = 80)
	public String desc;
	
}
