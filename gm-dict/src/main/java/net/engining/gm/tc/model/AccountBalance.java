package net.engining.gm.tc.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 帐户余额 TODO 移到cc
 * @author Ronny
 *
 */
@Deprecated
public class AccountBalance implements Serializable{
	
	private static final long serialVersionUID = 2841328287437111790L;

	/**
	 * 帐户类型
	 * 10- 储蓄账户
	 * 20- 支票账户
	 * 30- 信用卡账户
	 * 90- 积分账户
	 */
	private String accountType;
	
	/**
	 * 余额类型
	 * 01- 账面余额
	 * 02- 可用余额
	 */
	private String balanceType;
	
	/**
	 * 货币代码
	 * 3位货币代码，遵循ISO标准
	 * 156- 人民币账户
	 * 840- 美元账户
	 * 999-	联盟积分账户
	 */
	private String currencyCode;
	
	/**
	 * 余额方向
	 * 1位字符
	 * C- 贷方金额，表示账户有余额
	 * D- 借方金额，表示账户欠款
	 */
	private String direction;
	
	/**
	 * 金额
	 * 包含小数位，举例：5元3毛8分 -〉 5.38 
	 */
	private BigDecimal amount;

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBalanceType() {
		return balanceType;
	}

	public void setBalanceType(String balanceType) {
		this.balanceType = balanceType;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
}
