package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.repositories.UserRepository;
import com.revature.models.User;

@RestController
@RequestMapping("api/v1/users")
public class UserController {
	private UserRepository repo;
	@Autowired
	public UserController(UserRepository repo)
	{
		this.repo=repo;
	}
	@GetMapping
 public List<User> list()
 {
	 return this.repo.findAll();
 }
}
