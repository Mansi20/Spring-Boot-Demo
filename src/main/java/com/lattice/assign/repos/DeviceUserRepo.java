package com.lattice.assign.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lattice.assign.entities.Device_user_map;

public interface DeviceUserRepo extends JpaRepository<Device_user_map, Integer> {

}
