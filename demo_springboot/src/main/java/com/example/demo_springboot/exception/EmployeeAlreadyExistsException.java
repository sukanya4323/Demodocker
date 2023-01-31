package com.example.demo_springboot.exception;

public class EmployeeAlreadyExistsException extends Exception {
	private String msg;
	public EmployeeAlreadyExistsException(String msg) {
		super();
		this.msg=msg;
	}
	public EmployeeAlreadyExistsException() {
		
	}

}
