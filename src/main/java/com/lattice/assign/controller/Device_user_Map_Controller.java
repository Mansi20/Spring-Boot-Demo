package com.lattice.assign.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lattice.assign.entities.Device;
import com.lattice.assign.entities.Device_user_map;
import com.lattice.assign.entities.User;
import com.lattice.assign.services.DeviceService;
import com.lattice.assign.services.Device_user_service;
import com.lattice.assign.services.UserService;



@Controller
@RequestMapping("/mapAPI")

public class Device_user_Map_Controller {
	
		   // this method exposes the data as API and give back the response in JSON format*
			   @Autowired
		       UserService userService;
			   
			   @Autowired
			   DeviceService deviceService;
			   
			   @Autowired
			   Device_user_service dus;
			   
			 
			  
			   @RequestMapping(method =RequestMethod.GET, produces = "application/json",value="/{itemid}")
			  @ResponseBody
			   public Device_user_map devicemapAPI(@PathVariable("itemid") int itemId) {
			      Optional<User> ouser= userService.findUser(itemId);
			     
			     User user=ouser.orElse(new User());
			     System.out.println(user.getDevice());
			     Device_user_map map=new Device_user_map();
			    // map.setId(1);
			    
			   /*  List<Device> devices=user.getDevice();
			     for(Device device:devices)
			     {
			    	map. device.getId()
			     }*/
			     map.setUserId(user.getId());  
			     map.setUser_name(user.getUser_name());
			     map.setEmail(user.getEmail());
			     map.setCreated_on(user.getTag().getCreatedOn());
			     map.setActive(user.getTag().getIsActive());
			     
			     dus.saveDevice(map);
			     
				return map;
			     
			
		}

	}


