package com.lattice.assign.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lattice.assign.entities.Device;

public interface DeviceRepository extends JpaRepository<Device, Integer> {


}
