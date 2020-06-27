package com.hms.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hms.dao.AppointmentDetailsDAO;
import com.hms.dao.LoginPageDAO;

import com.hms.entities.PatientEntity;
import com.hms.model.AppointmentFix;
import com.hms.model.LoginPage;


@Controller
public class HMSController  {
	
	/*
	 * @GetMapping("/login") public String loginPage() { return "login"; }
	 */
	
	@Autowired
	LoginPageDAO loginPageDAO;
	
	@Autowired
	AppointmentDetailsDAO appointmentDetailsDAO;
	
	
	@GetMapping("/msg")
	@ResponseBody
	public String getMessage1() {
		return "hi welcome to HMS";
	}
	
	@GetMapping("/hmsapp")
	//@ResponseBody
	public ModelAndView getMessage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		
		return mv;
	}
	
	@GetMapping("/login")
	public ModelAndView loginPage() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("login",new LoginPage());
		mv.setViewName("loginPage");
		return mv;
		
	}
	
	

	/*
	 * @PostMapping("/loginvalidation") public ModelAndView
	 * loginValidation(@ModelAttribute LoginPage loginPage) { ModelAndView mv = new
	 * ModelAndView(); if(loginPage.getUserName().trim().equals("Sabari") &&
	 * loginPage.getPassword().trim().equals("Balaji")) { mv.setViewName("home");
	 * }else { mv.setViewName("error"); }
	 * 
	 * return mv; }
	 */

	
	@PostMapping("/loginvalidation")
	public ModelAndView loginValidation(@ModelAttribute LoginPage loginPage) {
		ModelAndView mv = new ModelAndView();
		
		boolean result = loginPageDAO.getLoginDetails(loginPage);
		System.out.println(result);
		  if(result)
		  { mv.setViewName("home"); 
		  
		  }else { 
			  mv.setViewName("error"); 
			  
		  }
		 
		return mv;
			
	}
	
	
	  @GetMapping("/appfix") 
	  public ModelAndView registrationPage() { 
		  System.out.println("Inside AppFix");
	  ModelAndView mv = new ModelAndView(); 
	  mv.addObject("appfix",new AppointmentFix());
	  mv.setViewName("appointmentFix"); 
	  return mv; 
	  }
	 
	  
	  
	  @PostMapping("/save")
	  
	  
	  @ResponseBody
	  public String saveAppointmentDetails(@ModelAttribute("appfix") AppointmentFix appointmentFix) {
		  System.out.println(appointmentFix); 
		  boolean result = appointmentDetailsDAO.createAppointmentDetails(appointmentFix);
		  System.out.println(result);
		  return "save"; 
		  }
	 

}
