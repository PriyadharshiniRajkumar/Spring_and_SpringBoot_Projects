package com.priyalearning.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.priyalearning.dao.AlienRepo;
import com.priyalearning.model.Alien;

@RestController   //-->  All the request will working like sending JSON/XML response and with Restful API
public class AlienController {
	
	@Autowired
	AlienRepo repo;

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "home.jsp";
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid) {
		ModelAndView mv = new ModelAndView("showAlien.jsp");
		Alien alien = repo.findById(aid).orElse(new Alien()); //OrElse is used to return null or new Alien obj, if no aid matches the table aid
		
	
		//Fetching data with Alien's property and using Custom query *
				  
		System.out.println(repo.findByTech("AllTech"));
		  System.out.println(repo.findByAidGreaterThan(2));
		  System.out.println(repo.findbyTechSorted("Java"));
		 
		mv.addObject(alien);
		return mv;
	}  
	
	/*Rest Ex to get all aliens data with resource URL
	@RequestMapping(path = "/aliens", produces = {"application/xml"})-> This will allows both JsON andXML format,  to restrict the format to XML 
	*/
	//@ResponseBody  --> No need to mention for RestController
	@GetMapping("/aliens")  	
	public List<Alien> getAliens() {
		return repo.findAll();
	}
	
	//Deleting a data from DB
	@DeleteMapping("/alien/{aid}")
	public String alienDelete(@PathVariable int aid){
		
		Alien a = repo.getOne(aid);
		repo.delete(a);
		return "Deleted!!";
		
	}
	
	//Put will use for Saving or Update
	@PutMapping(path="/alien", consumes= {"application/json"}) //Consumes --> Sever accept the format of Client
	public Alien saveOrUpdateAlien(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
	}
	
	
	//Storing a data from Client(Postman) to Server(Code)
	@PostMapping("/alien")
	public Alien alienadd(Alien alien) {
		repo.save(alien);
		return alien;
	}
	
	
	/*Rest Ex for getting alien data with dynamic aid passes through URL*/
	@RequestMapping("/alien/{aid}")
	public Optional<Alien> getAlienwithid(@PathVariable("aid") int aid) {
		return repo.findById(aid);
	}
	
	
}
