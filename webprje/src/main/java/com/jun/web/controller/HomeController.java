package com.jun.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/") 
public class HomeController {

	@RequestMapping("index") 
	public String index() {
		
		return "index";
	}
	
	/*
	 * @Override public ModelAndView handleRequest(HttpServletRequest request,
	 * HttpServletResponse response) throws Exception { // TODO Auto-generated
	 * method stub ModelAndView mv=new ModelAndView("index");
	 * mv.addObject("data","hello spring mvc");
	 * //mv.setViewName("/WEB-INF/view/index.jsp");
	 * 
	 * return mv; }
	 */

}
