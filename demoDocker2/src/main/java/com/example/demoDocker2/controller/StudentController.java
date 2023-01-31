package com.example.demoDocker2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@RequestMapping("/student")
	String studentDetails() {
		return "Name: , Age: , ID:  ";
	}
}
