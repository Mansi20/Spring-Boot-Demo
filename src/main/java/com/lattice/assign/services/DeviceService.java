package com.lattice.assign.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.lattice.assign.entities.Device;

public interface DeviceService {

	
 Device saveDevice(Device device);
 Device updateDevice(Device device);
 void deleteDevice(Device device);

 //void useProtocol(int protocolId);

 
 List<Device> getAllDevices();
}
