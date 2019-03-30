package net.engining.gm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.engining.control.api.FlowDispatcher;
import net.engining.control.core.dispatch.DetailedFlowListener;
import net.engining.control.core.dispatch.MDCFlowListener;
import net.engining.control.core.dispatch.SimpleFlowDispatcher;
import net.engining.control.sdk.FlowTransProcessorTemplate;

/**
 * @author luxue
 *
 */
@Configuration
public class FlowTransContextConfig {
	
	/**
	 * 默认的Flow Trans Dispatcher
	 * @return
	 */
	@Bean
	public SimpleFlowDispatcher simpleFlowDispatcher(){
		return new SimpleFlowDispatcher();
	}
	
	@Bean
	public FlowTransProcessorTemplate flowTransProcessorTemplate(FlowDispatcher simpleFlowDispatcher){
		FlowTransProcessorTemplate flowTransProcessorTemplate = new FlowTransProcessorTemplate();
		flowTransProcessorTemplate.setTransactionProcessor(simpleFlowDispatcher);
		return flowTransProcessorTemplate;
	}
	
	@Bean
	public DetailedFlowListener detailedFlowListener(){
		DetailedFlowListener detailedFlowListener = new DetailedFlowListener();
		detailedFlowListener.setDumpProcedure(true);
		return detailedFlowListener;
	}
	
	@Bean
	public MDCFlowListener mdcFlowListener(){
		return new MDCFlowListener();
	}
	
}
