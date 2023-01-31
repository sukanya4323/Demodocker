package com.example.BankingAppPostgres;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	public StudentService service;

	@GetMapping(path="/getStudentDetails")
	public Iterable<Student> getDetails(){
		
		return service.getStudentDetails();
	}
	
	@GetMapping(path="/saveStudentDetails")
	public String saveDetails(@RequestParam String name){
		
		Student t = new Student();
		t.setS_name(name);
		
		service.saveStudents(t);
		
		return "Data saved successfully";
	}
	
	@GetMapping(path="/deleteStudentDetails")
	public String saveDetails(@RequestParam int id){
		
		Student t = new Student();
		t.setS_id(id);
		
		service.deleteStudentDetails(t);
		
		return "Data deleted successfully";
	}
}
