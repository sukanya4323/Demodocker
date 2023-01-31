package com.example.demo_springboot.entity;

import com.example.demo_springboot.exception.AgeException;
import com.example.demo_springboot.exception.EmployeeAlreadyExistsException;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.Value;

@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
//@EqualsAndHashCode
@Data
//@RequiredArgsConstructor
public class Employee {
	@Id
	@NotNull
	private int id;
	@NotNull
	private String firstName;
	private String lastName;
	private int age;

}
