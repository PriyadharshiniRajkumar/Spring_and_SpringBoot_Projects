package com.priyalearningSpringMVC;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int num1,@RequestParam("t2") int num2){
		int k=num1+num2;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result.jsp");
		mv.addObject("k",k);
		
		return mv;
		
	}
}
