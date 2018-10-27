package com.lattice.assign.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lattice.assign.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
