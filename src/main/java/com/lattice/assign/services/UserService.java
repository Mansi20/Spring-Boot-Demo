package com.lattice.assign.services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.lattice.assign.entities.User;

public interface UserService {
 
	
	List<User> getAllUsers();
}
