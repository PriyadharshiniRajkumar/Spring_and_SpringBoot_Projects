package com.priyalearning.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
 
//All configuration will takes place under Configuration Annotation
@Configuration
@ComponentScan(basePackages="com.priyalearning.web") //Will scan automatically component from mentioned package
public class AppConfig {

	/*//Instead of XML configuration, @Bean annotaion- bean dependency will be assgined
	@Bean
	public Samsung getPhone(){ 
		return new Samsung();
	}
	
	//In Beans, each configuration will check for what it is returning instead of method name 
	@Bean
	public Microprocessor getProcessor(){
		return new Spandragon();
	}*/
}
