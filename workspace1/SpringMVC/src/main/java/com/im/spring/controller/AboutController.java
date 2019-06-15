package com.im.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/about")
public class AboutController {
	@RequestMapping(method=RequestMethod.GET)
	public String showAbout(ModelMap model) {
		model.addAttribute("message1","Hi Machan From Spring MVC about page");
		return "about";
	}

}
