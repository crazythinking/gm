package net.engining.smartstar.config.test.support;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

import net.engining.gm.config.GeneralContextConfig;
import net.engining.gm.config.SnowflakeSequenceIDContextConfig;
import net.engining.gm.config.props.GmCommonProperties;

/**
 * 这个类用来组装需要的配置，根据不同的项目组装需要的配置项 <br>
 * 使用@Import用来导入@Configuration注解的config类(也可以通过@SpringBootApplication指定scanBasePackages来扫描@Configuration) <br>
 * 使用@ImportResource用来加载传统的xml配置
 * 
 * @author Eric Lu
 *
 */
@Configuration
@Profile("autotest")
@EnableConfigurationProperties(value = { 
		GmCommonProperties.class
		})
@Import(value = {
		SnowflakeSequenceIDContextConfig.class,
		GeneralContextConfig.class
		})
public class CombineConfiguration {

}
