package com.example.BankingAppPostgres;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	
	public StudentRepository repo;

	 public Iterable<Student> getStudentDetails()
	 {
		 return repo.findAll();
	 }
	 
	 public boolean deleteStudentDetails(Student t)
	 {
		  repo.delete(t);
		  
		  return true;
	 }
	 
	 public void saveStudents(Student t) {
		 repo.save(t);
	 }
}
