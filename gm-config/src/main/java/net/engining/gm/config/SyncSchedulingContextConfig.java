package net.engining.gm.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import net.engining.gm.config.props.GmCommonProperties;

/**
 * 同步并行的定时任务配置
 * 
 * @author luxue
 *
 */
@Configuration
@EnableScheduling
public class SyncSchedulingContextConfig implements SchedulingConfigurer {

	@Autowired
	GmCommonProperties gmCommonProperties;

	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {

		taskRegistrar.setTaskScheduler(defaultTaskExecutor());

	}

	@Bean(destroyMethod = "shutdown")
	public ThreadPoolTaskScheduler defaultTaskExecutor() {

		// 创建一个线程池调度器
		ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
		// 设置线程池容量
		scheduler.setPoolSize(gmCommonProperties.getScheduledThreadPoolSize());
		// 线程名前缀
		scheduler.setThreadNamePrefix(gmCommonProperties.getScheduledThreadNamePrefix());
		// 等待时常
		scheduler.setAwaitTerminationSeconds(gmCommonProperties.getAwaitTerminationSeconds());
		// 当调度器shutdown被调用时等待当前被调度的任务完成
		scheduler.setWaitForTasksToCompleteOnShutdown(gmCommonProperties.isWaitForTasksToCompleteOnShutdown());
		// 设置当任务被取消的同时从当前调度器移除的策略
		scheduler.setRemoveOnCancelPolicy(gmCommonProperties.isRemoveOnCancelPolicy());
		return scheduler;
	}

}
