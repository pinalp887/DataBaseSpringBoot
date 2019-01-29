package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value="/home")
	private String TestDemo() {
		return "Hello";
	}
	@GetMapping(value="/all")
	private List<User> getAllUser(){
		return userRepository.findAll();
	}
}
