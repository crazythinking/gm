package net.engining.gm.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.engining.gm.config.props.CommonProperties;
import net.engining.pg.support.db.id.generator.SnowflakeSequenceID;

/**
 * SnowflakeSequence 相关的context配置
 * 
 * @author Administrator
 *
 */
@Configuration
public class SnowflakeSequenceIDContextConfig {
	
	@Autowired
	CommonProperties commonProperties;

	@Bean
	public SnowflakeSequenceID snowflakeSequenceId() {
		SnowflakeSequenceID snowflakeSequenceID = new SnowflakeSequenceID(commonProperties.getSnowflakeWorkerId(), commonProperties.getSnowflakeDataCenterId());
		return snowflakeSequenceID;

	}

}
