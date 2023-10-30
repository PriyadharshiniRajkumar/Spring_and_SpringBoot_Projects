package com.priyalearning.web;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary //this is used to take which method to be implemented in Samsung class 
public class MediaTech implements Microprocessor {

	public void process() {
		System.out.println("2nd CPU processor");

	}

}
