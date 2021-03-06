package com.maybank.login_spring_security.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maybank.login_spring_security.model.Role;
import com.maybank.login_spring_security.repository.RoleRepository;

@Service
@Transactional
public class RoleService {
	@Autowired
	private RoleRepository repository;
	public List<Role> listAll(){
		System.out.println("hasil: " + repository.findAll());
		return repository.findAll();
	}
}
