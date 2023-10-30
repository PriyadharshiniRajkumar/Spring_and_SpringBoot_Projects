package com.priyalearning.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//this annotation will helps to get obj by default
@Component  //non qualified and decapitalized by default = it component name is samsung
public class Samsung {
	
	
	//This autowired will check for configuration file what is returning
	@Autowired 
	@Qualifier("spandragon") //Qualifier is used to process which impemented class needs to call
	Microprocessor cpu;	
	
	public Microprocessor getCpu() {
		return cpu;
	}



	public void setCpu(Microprocessor cpu) {
		this.cpu = cpu;
	}



	public void config(){
		System.out.println("Octa core, 4 gb Ram");
		cpu.process(); // as microprocess is returning Spandragon class's obj
	}

}
