package com.maybank.login_spring_security.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maybank.login_spring_security.services.*;
import com.maybank.login_spring_security.dto.*;
import com.maybank.login_spring_security.model.Role;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    private UserService userService;
    private RoleService roleService;
    public UserRegistrationController(UserService userService, RoleService roleService) {
        super();
        this.userService = userService;
        this.roleService = roleService;
    }

    @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }

    @GetMapping
    public String showRegistrationForm(Model model) {
    	List<Role> role = roleService.listAll();
    	System.out.println("hasil: " + roleService.listAll());
    	model.addAttribute("role", role);
        return "registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
        userService.save(registrationDto);
        return "redirect:/registration?success";
    }
}
