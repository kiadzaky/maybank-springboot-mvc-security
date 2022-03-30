package com.maybank.login_spring_security.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.maybank.login_spring_security.model.*;
import com.maybank.login_spring_security.dto.*;

public interface UserService extends UserDetailsService{
 User save(UserRegistrationDto registrationDto);
}