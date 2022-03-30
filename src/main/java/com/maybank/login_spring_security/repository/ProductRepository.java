package com.maybank.login_spring_security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maybank.login_spring_security.model.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
 
}