package net.engining.gm.config.props;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 工程通用配置
 * 
 * @author luxue
 *
 */
@ConfigurationProperties(prefix = "gm.common")
public class GmCommonProperties {

	/**
	 * Swagger扫描包
	 */
	private String swaggerBasePackage;

	/**
	 * 默认Org
	 */
	private String defaultOrgId;

	/**
	 * JWT 签名Key
	 */
	private String jwtSignKey;

	/**
	 * JWT过期毫秒数
	 */
	private long jwtExpirationMills;

	/**
	 * 默认管理控制台密码
	 */
	private String defaultPassword;

	/**
	 * 默认并行定时任务线程池Size
	 */
	private int scheduledThreadPoolSize = 5;
	
	/**
	 * 定时任务名称前缀
	 */
	private String scheduledThreadNamePrefix;
	
	/**
	 * 线程终止时等待秒数
	 */
	private int awaitTerminationSeconds = 60;
	
	/**
	 * 当调度器shutdown被调用时是否等待当前被调度的任务完成
	 */
	private boolean waitForTasksToCompleteOnShutdown = true;
	
	/**
	 * 设置当任务被取消的同时是否从当前调度器移除的策略
	 */
	private boolean removeOnCancelPolicy = true;
	
	private long snowflakeWorkerId;
	
	private long snowflakeDataCenterId;
	
	private int asyncExcutorColePoolSize = 5;
	
	private int asyncExcutorMaxPoolSize = 5;
	
	private int asyncExcutorQueueCapacity = 10;
	
	private String asyncExcutorThreadNamePrefix;

	/**
	 * @return the asyncExcutorThreadNamePrefix
	 */
	public String getAsyncExcutorThreadNamePrefix() {
		return asyncExcutorThreadNamePrefix;
	}

	/**
	 * @param asyncExcutorThreadNamePrefix the asyncExcutorThreadNamePrefix to set
	 */
	public void setAsyncExcutorThreadNamePrefix(String asyncExcutorThreadNamePrefix) {
		this.asyncExcutorThreadNamePrefix = asyncExcutorThreadNamePrefix;
	}

	/**
	 * @return the asyncExcutorColePoolSize
	 */
	public int getAsyncExcutorColePoolSize() {
		return asyncExcutorColePoolSize;
	}

	/**
	 * @param asyncExcutorColePoolSize the asyncExcutorColePoolSize to set
	 */
	public void setAsyncExcutorColePoolSize(int asyncExcutorColePoolSize) {
		this.asyncExcutorColePoolSize = asyncExcutorColePoolSize;
	}

	/**
	 * @return the asyncExcutorMaxPoolSize
	 */
	public int getAsyncExcutorMaxPoolSize() {
		return asyncExcutorMaxPoolSize;
	}

	/**
	 * @param asyncExcutorMaxPoolSize the asyncExcutorMaxPoolSize to set
	 */
	public void setAsyncExcutorMaxPoolSize(int asyncExcutorMaxPoolSize) {
		this.asyncExcutorMaxPoolSize = asyncExcutorMaxPoolSize;
	}

	/**
	 * @return the asyncExcutorQueueCapacity
	 */
	public int getAsyncExcutorQueueCapacity() {
		return asyncExcutorQueueCapacity;
	}

	/**
	 * @param asyncExcutorQueueCapacity the asyncExcutorQueueCapacity to set
	 */
	public void setAsyncExcutorQueueCapacity(int asyncExcutorQueueCapacity) {
		this.asyncExcutorQueueCapacity = asyncExcutorQueueCapacity;
	}

	public String getSwaggerBasePackage() {
		return swaggerBasePackage;
	}

	public void setSwaggerBasePackage(String swaggerBasePackage) {
		this.swaggerBasePackage = swaggerBasePackage;
	}

	public String getDefaultOrgId() {
		return defaultOrgId;
	}

	public void setDefaultOrgId(String defaultOrgId) {
		this.defaultOrgId = defaultOrgId;
	}

	public String getJwtSignKey() {
		return jwtSignKey;
	}

	public void setJwtSignKey(String jwtSignKey) {
		this.jwtSignKey = jwtSignKey;
	}

	public long getJwtExpirationMills() {
		return jwtExpirationMills;
	}

	public void setJwtExpirationMills(long jwtExpirationMills) {
		this.jwtExpirationMills = jwtExpirationMills;
	}

	public String getDefaultPassword() {
		return defaultPassword;
	}

	public void setDefaultPassword(String defaultPassword) {
		this.defaultPassword = defaultPassword;
	}

	public int getScheduledThreadPoolSize() {
		return scheduledThreadPoolSize;
	}

	public void setScheduledThreadPoolSize(int scheduledThreadPoolSize) {
		this.scheduledThreadPoolSize = scheduledThreadPoolSize;
	}

	public String getScheduledThreadNamePrefix() {
		return scheduledThreadNamePrefix;
	}

	public void setScheduledThreadNamePrefix(String scheduledThreadNamePrefix) {
		this.scheduledThreadNamePrefix = scheduledThreadNamePrefix;
	}

	public int getAwaitTerminationSeconds() {
		return awaitTerminationSeconds;
	}

	public void setAwaitTerminationSeconds(int awaitTerminationSeconds) {
		this.awaitTerminationSeconds = awaitTerminationSeconds;
	}

	public boolean isWaitForTasksToCompleteOnShutdown() {
		return waitForTasksToCompleteOnShutdown;
	}

	public void setWaitForTasksToCompleteOnShutdown(boolean waitForTasksToCompleteOnShutdown) {
		this.waitForTasksToCompleteOnShutdown = waitForTasksToCompleteOnShutdown;
	}

	public boolean isRemoveOnCancelPolicy() {
		return removeOnCancelPolicy;
	}

	public void setRemoveOnCancelPolicy(boolean removeOnCancelPolicy) {
		this.removeOnCancelPolicy = removeOnCancelPolicy;
	}

	public long getSnowflakeWorkerId() {
		return snowflakeWorkerId;
	}

	public void setSnowflakeWorkerId(long snowflakeWorkerId) {
		this.snowflakeWorkerId = snowflakeWorkerId;
	}

	public long getSnowflakeDataCenterId() {
		return snowflakeDataCenterId;
	}

	public void setSnowflakeDataCenterId(long snowflakeDataCenterId) {
		this.snowflakeDataCenterId = snowflakeDataCenterId;
	}

}
