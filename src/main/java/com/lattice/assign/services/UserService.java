package com.lattice.assign.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;

import com.lattice.assign.entities.User;

public interface UserService {
 
    Optional<User> findUser(int userId);
	List<User> getAllUsers();
}
