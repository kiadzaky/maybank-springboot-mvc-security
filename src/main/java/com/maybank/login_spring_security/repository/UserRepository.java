package com.maybank.login_spring_security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maybank.login_spring_security.model.*;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
 User findByEmail(String email);
}
