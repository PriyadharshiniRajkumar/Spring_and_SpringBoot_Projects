package com.priyalearning.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Samsung s7= factory.getBean(Samsung.class);
		s7.config();
	}

}

/*
 * <!-- File used for the example of Bean configuration, Application Context,
 * Bean Property and Constructor Injection , Autowired -->
 * 
 * ApplicationContext context = new
 * ClassPathXmlApplicationContext("Spring.xml");
 * 
 * //Vehicle obj= new Car(); //This is loosely couple, it we want to change this
 * to Bike, it can be replaced easily
 * 
 * 
 * Annotation based configuration Vehicle obj = (Vehicle)
 * context.getBean("bike"); //This injecting the dependency is from outside,
 * instead of changing source code of Java obj.drive();
 * 
 * ex for Bean Property and constructor injection Tyre t = (Tyre)
 * context.getBean("tyre"); System.out.println(t);
 * 
 * AutoWired Example Car car= (Car) context.getBean("car"); car.drive();
 */
