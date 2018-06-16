package net.engining.gm.param.model;

import java.io.Serializable;

import net.engining.pg.support.meta.PropertyInfo;

/**
 * 机构信息
 * @author zhaojin
 *
 */
public class OrganizationInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 机构编号(key)
	 */
	@PropertyInfo(name="机构编号", length=12)
	public String orgId;
	
	/**
	 * 机构名称
	 */
	@PropertyInfo(name="机构名称", length=40)
	public String name;
    
    /**
     * 描述
     */
    @PropertyInfo(name="描述", length=80)
    public String description;

    /**
     * 地址
     */
    @PropertyInfo(name="地址", length=200)
    public String address;

    /**
     * 城市
     */
    @PropertyInfo(name="城市", length=40)
    public String city;

    /**
     * 省份
     */
    @PropertyInfo(name="省份", length=40)
    public String state;

    /**
     * 国家代码
     */
    @PropertyInfo(name="国家代码", length=3)
    public String countryCode;

    /**
     * 联系电话1
     */
    @PropertyInfo(name="联系电话1", length=20)
    public String phone1;

    /**
     * 联系电话2
     */
    @PropertyInfo(name="联系电话2", length=20)
    public String phone2;

    /**
     * 客服电话
     */
    @PropertyInfo(name="客服电话", length=20)
    public String cssPhone;
    
    /**
     * 传真
     */
    @PropertyInfo(name="传真", length=20)
    public String fax;

    /**
     * 电子邮箱
     */
    @PropertyInfo(name="电子邮箱", length=40)
    public String email;

    /**
     * 基准货币
     */
    @PropertyInfo(name="基准货币", length=3)
    public String baseCurrencyCode;
    
    /**
     * 年利率基准天数
     */
    @PropertyInfo(name="年利率基准天数", length=3)
    public Integer annualInterestRateBenchmarkDays;

}
