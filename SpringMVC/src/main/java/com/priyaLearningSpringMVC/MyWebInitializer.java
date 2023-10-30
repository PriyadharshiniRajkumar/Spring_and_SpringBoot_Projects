package com.priyaLearningSpringMVC;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

 
public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

/*	Setting configuration of priyaLearningSpringMVC-servlet.xml in SpringMVCConfig.class*/
	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{SpringMVCConfig.class};
	}

	/*Setting ServletMapping instead of web.xml Servlet configutation - Dispatcher Servlet*/
	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}

}
