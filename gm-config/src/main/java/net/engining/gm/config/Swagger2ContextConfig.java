package net.engining.gm.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import io.swagger.annotations.ApiOperation;
import net.engining.gm.config.props.CommonProperties;
import net.engining.pg.support.utils.ValidateUtilExt;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * 校验器相关的Context配置
 * @author Administrator
 *
 */
@Configuration
//@EnableSwagger2//这个配置移到顶层Config；打开swagger，访问/swagger-ui.html
public class Swagger2ContextConfig {
	
	@Autowired
	Environment environment;
	
	@Autowired
	CommonProperties commonProperties;
	
	@Bean
    public Docket createRestApi() {
		String profileActived = environment.getProperty("spring.profiles.active");
		Docket docket = null;
		if(ValidateUtilExt.isNotNullOrEmpty(profileActived)){
			if(profileActived.contains("dev") || profileActived.contains("sit") || profileActived.contains("uat")){
				docket = new Docket(DocumentationType.SWAGGER_2)
		                .apiInfo(apiInfo())
		                .select()
		                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
		                .paths(PathSelectors.any())
		                .build();
			}
			else{
				docket = new Docket(DocumentationType.SWAGGER_2)
		                .apiInfo(apiInfo())
		                .select()
		                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
		                .paths(PathSelectors.none())
		                .build();
			}
		}
		else {
			docket = new Docket(DocumentationType.SWAGGER_2)
	                .apiInfo(apiInfo())
	                .select()
	                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
	                .paths(PathSelectors.none())
	                .build();
		}
		
        return docket;
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger2 RESTful APIs for "+commonProperties.getAppname())
                .description("微服务项目的基于 Swagger2 RESTful APIs 的文档")
                .version(commonProperties.getAppVersion())
                .build();
    }
}
