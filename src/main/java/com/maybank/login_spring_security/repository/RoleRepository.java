package com.maybank.login_spring_security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maybank.login_spring_security.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	
}
