package net.engining.gm.config;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.fasterxml.jackson.annotation.JsonInclude;

import net.engining.pg.web.handler.nest.NestGlobalControllerExceptionHandler;

/**
 * Spring Mvc的扩展配置
 * @author Eric Lu
 *
 */
@Configuration
//如果需要保持Spring boot MVC的功能，但是需要添加额外MVC configuration，可以通过@Configuration注解继承WebMvcConfigurerAdapter的类，但是不要添加@EnableWebMvc注解;
//*ConfigurerAdapter通常是重载默认配置或附加额外配置的入口
//如果想要完全控制Spring MVC，可以定义注解@Configuration并加上注解@EnableWebMvc;
@ComponentScan(basePackageClasses={NestGlobalControllerExceptionHandler.class})//这里显示的指定扫描类所在的包，避免其他不需要的组件被扫描
public class WebMvcExtContextConfig implements WebMvcConfigurer{
	
	@Override
	public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
		//通过这个钩子，修改MessageConverter的配置，这里对json转换的行为修改，忽略null
		for (HttpMessageConverter converter : converters) {
			if (converters instanceof MappingJackson2HttpMessageConverter) {
				((MappingJackson2HttpMessageConverter) converters).getObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL);
			}
		}
	}
}
