package com.lattice.assign.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lattice.assign.entities.Device;
import com.lattice.assign.entities.Protocol;
import com.lattice.assign.repos.DeviceRepository;
@Service
public class DeviceServiceImpl implements DeviceService {

	
	@Autowired
	DeviceRepository deviceRepo;
	@Override
	public Device saveDevice(Device device) {
		// TODO Auto-generated method stub
		return deviceRepo.save(device);
	}

	@Override
	public Device updateDevice(Device device) {
		// TODO Auto-generated method stub
		return deviceRepo.save(device);
	}

	@Override
	public void deleteDevice(Device device) {
		// TODO Auto-generated method stub
       deviceRepo.delete(device);
	}



	@Override
	public List<Device> getAllDevices() {
		// TODO Auto-generated method stub
		return deviceRepo.findAll();
	}

	

	
//it is checked that a protocol used by device cannot be used elsewhere 
//	@Override
	public void useProtocol(int protocolId) {
		// TODO Auto-generated method stub
	Protocol protocol=new Protocol(protocolId);
 
	long millis=System.currentTimeMillis();  
	java.sql.Date date=new java.sql.Date(millis);  
//effectivity date is checked
	if(protocol.isUsed()==false &&date.after(protocol.getEffectivityDate()))
	{
		System.out.println("Device can run on it");
		protocol.setUsed(true);
	}
		
	}

}
