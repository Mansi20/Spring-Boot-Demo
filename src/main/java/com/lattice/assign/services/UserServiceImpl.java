package com.lattice.assign.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lattice.assign.entities.User;
import com.lattice.assign.repos.UserRepository;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		
		return userRepository.findAll();
	}
	@Override
	public Optional<User> findUser(int userId) {
		// TODO Auto-generated method stub
		return userRepository.findById(userId);
	}
	

}
