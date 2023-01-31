package com.example.demo_springboot.service;

import java.util.List;
import java.util.Optional;

import com.example.demo_springboot.entity.Employee;
import com.example.demo_springboot.exception.EmployeeAlreadyExistsException;

public interface EmployeeService {
	 Employee saveEmployee(Employee emp) throws EmployeeAlreadyExistsException;
	 List<Employee>getAllEmployees();
	 Optional<Employee>getEmployeeById(int id);
	 Employee updateEmployee(Employee emp);
	 String deleteEmployeeById(int id);
	 List<Employee>getEmployeeByFirstName(String firstname);

}
