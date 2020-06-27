package com.hms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hms.dao.LoginPageDAO;



@Controller
public class LoginPageService {
	
	@Autowired
	LoginPageDAO loginPageDAO;
	
	

}
