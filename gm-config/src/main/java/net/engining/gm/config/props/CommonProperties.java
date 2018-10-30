package net.engining.gm.config.props;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

import lombok.Getter;
import lombok.Setter;

/**
 * 工程通用配置
 * 
 * @author luxue
 *
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "gm.common")
public class CommonProperties implements EnvironmentAware {

	private static final String UNKNOWN = "unknown";
	private String appname = UNKNOWN;
	
	private String appVersion = UNKNOWN;
	
	/**
	 * 是否使用Json ParameterFacility
	 */
	private boolean isJsonParameterFacility = false;

	/**
	 * 缓存过期时间值
	 */
	private long expireDuration = 5;

	/**
	 * 缓存过期时间单位
	 */
	private TimeUnit expireTimeUnit = TimeUnit.MINUTES;

	/**
	 * 是否使用RedisCache的开关, 默认false
	 */
	private boolean enableRedisCache = false;

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

	@Override
	public void setEnvironment(Environment environment) {
		String springAppName = environment.getProperty("spring.application.name");
		String springAppVersion = environment.getProperty("info.version");
		if (org.springframework.util.StringUtils.hasText(springAppName)) {
			if (StringUtils.isBlank(this.appname) || UNKNOWN.equals(this.appname)) {
				setAppname(springAppName);
			}
		}

		if (org.springframework.util.StringUtils.hasText(springAppVersion)) {
			if (StringUtils.isBlank(this.appVersion) || UNKNOWN.equals(this.appVersion)) {
				setAppname(springAppVersion);
			}
		}
	}

}
