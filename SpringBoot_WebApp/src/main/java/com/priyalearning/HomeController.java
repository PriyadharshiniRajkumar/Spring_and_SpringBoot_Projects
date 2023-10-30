package com.priyalearning;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	@RequestMapping("home")
	public ModelAndView home(Aliens alien) //this method will accepts request - http://localhost:8080/home?aid=101&aname=priya and adapt directly into Aliens pojo
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("home");
		mv.addObject("obj",alien); //passing this model obj to view
		//return "home"; // no need to mention extension of the file here as "home.jsp", instead change the property in Application.properties file
		return mv;
	}

}
