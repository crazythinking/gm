package net.engining.gm.config;

import java.lang.reflect.Method;
import java.util.concurrent.ThreadPoolExecutor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.lang.Nullable;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import net.engining.gm.config.props.GmCommonProperties;

/**
 * 
 * @author luxue
 *
 */
@Configuration
@EnableAsync
public class AsyncExtContextConfig extends AsyncConfigurerSupport {
	
	@Autowired
	GmCommonProperties gmCommonProperties;
	
	/**
	 * 注意：在没有加@Bean的时候，该TaskExecutor不是被spring Ioc完全托管的
	 */
	@Override
	@Bean
	public TaskExecutor getAsyncExecutor() {
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		taskExecutor.setCorePoolSize(gmCommonProperties.getAsyncExcutorColePoolSize());
		taskExecutor.setMaxPoolSize(gmCommonProperties.getAsyncExcutorMaxPoolSize());
		taskExecutor.setQueueCapacity(gmCommonProperties.getAsyncExcutorQueueCapacity());
		taskExecutor.setThreadNamePrefix(gmCommonProperties.getAsyncExcutorThreadNamePrefix());
		//线程池对拒绝任务（无线程可用）的处理策略:直接抛出java.util.concurrent.RejectedExecutionException异常
		taskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
		return taskExecutor;
	}
	
	@Override
	@Nullable
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		return new CustomedAsyncUncaughtExceptionHandler();
	}
	
	public class CustomedAsyncUncaughtExceptionHandler implements AsyncUncaughtExceptionHandler{

		@Override
		public void handleUncaughtException(Throwable ex, Method method, Object... params) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
