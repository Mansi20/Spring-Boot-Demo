package com.lattice.assign.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lattice.assign.entities.Device_user_map;
import com.lattice.assign.repos.DeviceUserRepo;
@Service
public class Device_user_map_impl implements Device_user_service {

	
	@Autowired
	DeviceUserRepo dur;
	@Override
	public Device_user_map saveDevice(Device_user_map map) {
		// TODO Auto-generated method stub
		return dur.save(map);
	}

}
