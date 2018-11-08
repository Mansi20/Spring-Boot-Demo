package com.lattice.assign.controller;

import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lattice.assign.entities.Device;
import com.lattice.assign.entities.Protocol;
import com.lattice.assign.entities.User;
import com.lattice.assign.services.DeviceService;
import com.lattice.assign.services.UserService;
@Controller
@RequestMapping("/usersAPI")

public class UserController {
	   // this method exposes the data as API and give back the response in JSON format*
		   @Autowired
	       UserService userService;
		   
		   @Autowired 
		   DeviceService deviceService;
		   User user=new User();
		   @ResponseBody
		   @RequestMapping(method =RequestMethod.GET, produces = "application/json")
		   
		   //this remove method will not return the email
		   public List<User> deviceAPI() {
		       Device dev=new Device();
		       dev.setDescription("new device");
		       dev.setStatus("working");
		       dev.setOperatorId("1");
		       Protocol pro=new Protocol();
		       pro.setTitle("protocol");
		       pro.setUsed(false);
		       Date ed=new Date(0);
		       Protocol pro1=new Protocol();
		       pro1.setTitle("protocol");
		       pro1.setUsed(false);
		       Date ed1=new Date(0);
		       pro1.setEffectivityDate(ed1);
		       Protocol pro2=new Protocol();
		       pro2.setTitle("protocol");
		       pro2.setUsed(false);
		     
		       Date ed2=new Date(0);
		       pro2.setEffectivityDate(ed2);
		       pro.setEffectivityDate(ed);
		       Set<Protocol> protocols=new HashSet<Protocol>();
		       protocols.add(pro);
		       protocols.add(pro1);
		       protocols.add(pro2);
		       dev.setProtocol(protocols);
		         
			   deviceService.saveDevice(dev);
			   
			   
			   
			   return userService.getAllUsers();
		   
		
	}

}
