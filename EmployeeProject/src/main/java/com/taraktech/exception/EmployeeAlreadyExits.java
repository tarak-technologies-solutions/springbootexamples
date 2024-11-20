package com.taraktech.exception;

public class EmployeeAlreadyExits extends RuntimeException{
	public EmployeeAlreadyExits(String message) {
		super(message);
	}
}
