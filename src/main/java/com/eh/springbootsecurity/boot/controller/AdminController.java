package com.eh.springbootsecurity.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class AdminController {

	@GetMapping("/admin")
	public ModelAndView goIndex() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin");
		return mv;
	}
}
