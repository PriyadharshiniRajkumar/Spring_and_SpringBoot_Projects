package com.priyalearning.web;

import org.springframework.stereotype.Component;

@Component  //Annotation
public class Bike implements Vehicle{
	public void drive() {
		System.out.println("Lets go..Bike...");
	}


}
