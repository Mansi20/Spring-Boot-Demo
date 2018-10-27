package com.lattice.assign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lattice.assign.entities.User;
import com.lattice.assign.services.UserService;
@Controller
@RequestMapping("/usersAPI")

public class UserController {
	   // this method exposes the data as API and give back the response in JSON format*
		   @Autowired
	       UserService userService;
		   
		   User user=new User();
		   @ResponseBody
		   @RequestMapping(method =RequestMethod.GET, produces = "application/json")
		   
		   //this remove method will not return the email
		   public List<User> deviceAPI() {
		       return userService.getAllUsers();
		   
		
	}

}
