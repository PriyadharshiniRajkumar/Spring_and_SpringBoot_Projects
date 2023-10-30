package com.priyaLearningSpringMVC;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.priyaLearningSpringMVC.service.AddService;


@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add( @RequestParam("t1") int i, @RequestParam("t2") int j){
		/*
		 * @RequestParama can avoid getParameter form the request 
		 * int i=Integer.parseInt(request.getParameter("t1")); 
		 * int j=Integer.parseInt(request.getParameter("t2"));
		 */

		/* Logical operation should not be in Controller, Instead */
		// int k=i+j;
		 
		AddService as = new AddService();
		int k= as.Add_service(i, j);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");//no need to extension for the file, becoz in future .jsp can be anything, instead configure in Configuration file
		mv.addObject("result",k);
		
		return mv;
	}
}
