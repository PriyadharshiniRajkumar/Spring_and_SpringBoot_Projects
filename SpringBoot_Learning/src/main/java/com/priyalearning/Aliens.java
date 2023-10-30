package com.priyalearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  //used to create object in bean - s.container
//@Scope(value = "prototype")  - used to created the object when required and not on default to create only one obj.
public class Aliens {

	
	private int aid;
	private String name;
	private String tech;
	@Autowired //Try to connect laptop obj by type Laptop in S.Container automatically, as Alien depend on Laptop class
	private Laptop laptop;
	
	
	public Aliens() {
		
		super();
		System.out.println("In Constructor.... ");
	}
	
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	
	
	public Laptop getLaptop() {
		return laptop;
	}


	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}


	public void show() {
		System.out.println("In Show method......");
		laptop.complie();
	}

}
