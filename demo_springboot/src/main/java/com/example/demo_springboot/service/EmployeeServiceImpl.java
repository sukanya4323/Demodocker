package com.example.demo_springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_springboot.entity.Employee;
import com.example.demo_springboot.exception.EmployeeAlreadyExistsException;
import com.example.demo_springboot.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public Employee saveEmployee(Employee emp) throws EmployeeAlreadyExistsException {
		if(empRepo.existsById(emp.getId()))
			throw new EmployeeAlreadyExistsException();
		
	Employee savedEmp=empRepo.save(emp);
	return savedEmp;
	}
	 @Override
	 public List<Employee> getAllEmployees(){
		 List<Employee> employees=empRepo.findAll();
		 return employees;
	 }
	 
	 @Override
	 public Optional<Employee> getEmployeeById(int id){
		 Optional<Employee> emp=empRepo.findById(id);
		 return emp;
	 }
	 @Override
	 public Employee updateEmployee(Employee emp) {
		 Employee upEmp=empRepo.save(emp);
		 return upEmp;
	 }
	 @Override
	 public String deleteEmployeeById(int id) {
		 Optional<Employee> emp=empRepo.findById(id);
		 if(emp.isPresent()) {
			 empRepo.deleteById(id);
			 return "deleted successfully";
		 }
		 return "id doesnot exist";
	 }
	 @Override
	 public List<Employee>getEmployeeByFirstName(String firstName){
		 List<Employee> list=empRepo.findByFirstName(firstName);
		 return list;
	 }

}
