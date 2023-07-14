package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.entity.Registration;
@Repository
public interface Regrepo extends JpaRepository<Registration, Integer> {
	
boolean existsByEmail(String email);
	
	Registration getByEmail(String email);

}
