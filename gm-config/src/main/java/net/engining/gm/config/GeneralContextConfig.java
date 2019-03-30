package net.engining.gm.config;

import net.engining.gm.config.props.GmCommonProperties;
import net.engining.pg.param.props.PgParamAndCacheProperties;
import net.engining.pg.parameter.*;
import net.engining.pg.props.CommonProperties;
import net.engining.pg.support.core.context.ApplicationContextHolder;
import net.engining.pg.support.core.context.ProcessesProvider4Organization;
import net.engining.pg.support.core.context.Provider4Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * 通用Context配置
 * @author Eric Lu
 *
 */
@Configuration
public class GeneralContextConfig {
	
	@Autowired
	CommonProperties commonProperties;
	
	@Autowired
	PgParamAndCacheProperties pgParamAndCacheProperties;
	
	@Autowired
	GmCommonProperties gmCommonProperties;
	
	/**
	 * ApplicationContext的静态辅助Bean，建议项目必须注入
	 * @return
	 */
	@Bean
	@Lazy(value=false)
	public ApplicationContextHolder applicationContextHolder(){
		return new ApplicationContextHolder();
	}
	
	/**
	 * 参数体系辅助Bean，建议项目必须注入
	 * @return
	 */
	@Bean
	public ParameterFacility parameterFacility(){
		if (pgParamAndCacheProperties.isEnableRedisCache()) {
			if(pgParamAndCacheProperties.isJsonParameterFacility()){
				JsonRedisCachedParameterFacility jsonRedisCachedParameterFacility = new JsonRedisCachedParameterFacility();
				jsonRedisCachedParameterFacility.setExpireDuration(pgParamAndCacheProperties.getExpireDuration());
				jsonRedisCachedParameterFacility.setExpireTimeUnit(pgParamAndCacheProperties.getExpireTimeUnit());
				return jsonRedisCachedParameterFacility;
			}
			XmlRedisCachedParameterFacility xmlRedisCachedParameterFacility = new XmlRedisCachedParameterFacility();
			xmlRedisCachedParameterFacility.setExpireDuration(pgParamAndCacheProperties.getExpireDuration());
			xmlRedisCachedParameterFacility.setExpireTimeUnit(pgParamAndCacheProperties.getExpireTimeUnit());
			return xmlRedisCachedParameterFacility;
		}
		
		if(pgParamAndCacheProperties.isJsonParameterFacility()){
			JsonGuavaCachedParameterFacility jsonGuavaCachedParameterFacility = new JsonGuavaCachedParameterFacility();
			jsonGuavaCachedParameterFacility.setExpireDuration(pgParamAndCacheProperties.getExpireDuration());
			jsonGuavaCachedParameterFacility.setExpireTimeUnit(pgParamAndCacheProperties.getExpireTimeUnit());
			return jsonGuavaCachedParameterFacility;
		}
		XmlGuavaCachedParameterFacility xmlGuavaCachedParameterFacility = new XmlGuavaCachedParameterFacility();
		xmlGuavaCachedParameterFacility.setExpireDuration(pgParamAndCacheProperties.getExpireDuration());
		xmlGuavaCachedParameterFacility.setExpireTimeUnit(pgParamAndCacheProperties.getExpireTimeUnit());
		return xmlGuavaCachedParameterFacility;
	}
	
	@Bean
	public Provider4Organization provider4Organization(){
		ProcessesProvider4Organization processesProvider4Organization = new ProcessesProvider4Organization();
		//从配置文件获取默认机构ID
		processesProvider4Organization.setCurrentOrganizationId(gmCommonProperties.getDefaultOrgId());
		return processesProvider4Organization;
	}
}
