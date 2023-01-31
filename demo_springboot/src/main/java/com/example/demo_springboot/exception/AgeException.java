package com.example.demo_springboot.exception;

public class AgeException extends Exception{
	private String msg1;

	public AgeException() {
		super();
	}

	public AgeException(String msg1) {
		super();
		this.msg1 = msg1;
	}

}
