package com.lattice.assign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lattice.assign.entities.Device;
import com.lattice.assign.services.DeviceService;

@Controller
@RequestMapping("/deviceAPI")
public class DeviceController {
       
	   // this method exposes the data as API and give back the response in JSON format*
	   @Autowired
       DeviceService deviceService;
	   @ResponseBody
	   @RequestMapping(method =RequestMethod.GET, produces = "application/json")
	   public List<Device> deviceAPI() {
	       return deviceService.getAllDevices();
	   }
	
}
