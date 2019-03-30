package net.engining.gm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import net.engining.pg.web.filter.Log4jMappedDiagnosticContextFilter;

/**
 * Web.xml的扩展配置，主要包含自定义Filter，Listener，servlet；
 * @author Eric Lu
 *
 */
@Configuration
public class WebContextConfig{
	
	@Bean
	public Log4jMappedDiagnosticContextFilter log4jMappedDiagnosticContextFilter(){
		return new Log4jMappedDiagnosticContextFilter();
	}
	
	/**
	 * MultipartConfigElement 和 CommonsMultipartResolver不可同时配置(Spring boot默认auto config MultipartConfigElement and StandardServletMultipartResolver)
	 * 要用CommonsMultipartResolver需要exclude MultipartAutoConfiguration，另需要commons-fileupload依赖
	 * @return
	 */
	@Bean
	public CommonsMultipartResolver multipartResolver() {
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
		multipartResolver.setDefaultEncoding("utf-8");
		multipartResolver.setMaxUploadSize(10240000);
		multipartResolver.setMaxInMemorySize(10240000);
		return multipartResolver;
	}
	
}
