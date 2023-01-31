package com.example.BankingAppPostgres;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/demo")
public class ShoppingController {
	
	@Autowired
	private ProjectService service;
	

	@GetMapping(path="/all")
	public @ResponseBody String getAllUsers() {
		System.out.println("inside all");
		return "This is successful test";
	}
	
	@GetMapping(path="/defaultList")
	public @ResponseBody String getAllUsersList() {
		System.out.println("inside all");
		return "This is successful test with default list";
	}

	@GetMapping(path="/projectList")
	public @ResponseBody Iterable<Project>  getAllProjects() {
		System.out.println("inside all");
		return service.getAllprojects() ;
	}
}
