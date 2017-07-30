package com.intelligrape.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	   @RequestMapping("/helloworld")
	   public ModelAndView helloWord(){
		      String message = "Hello World, Spring 3.0!";
		      return new ModelAndView("helloworld", "message",message);
	   }
  }
