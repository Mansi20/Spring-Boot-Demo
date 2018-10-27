package com.lattice.assign.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lattice.assign.entities.Tag;

public interface TagRepository extends JpaRepository<Tag, Integer> {

}
