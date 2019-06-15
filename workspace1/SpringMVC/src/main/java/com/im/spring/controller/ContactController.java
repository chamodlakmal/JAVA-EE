package com.im.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/contact")
public class ContactController {
	@RequestMapping(method=RequestMethod.GET)
	public String showHome(ModelMap model) {
		//DB Connection
		//data Retrieve
		//Pass Data to view
		model.addAttribute("message","Hi Machan From Spring MVC");
		return "contact";
	}
}
