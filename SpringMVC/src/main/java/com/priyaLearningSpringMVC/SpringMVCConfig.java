package com.priyaLearningSpringMVC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


/*Converting the configuration priyaLearningSpringMVC-servlet.xml to class file*/
@Configuration
@ComponentScan({"com.priyaLearningSpringMVC"})
public class SpringMVCConfig {
	
	@Bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/");
		vr.setSuffix(".jsp");
		return vr;
	}

}
