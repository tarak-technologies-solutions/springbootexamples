package com.taraktech.exception;

public class EmployeeNotExits extends RuntimeException {
	public EmployeeNotExits(String message) {
		super(message);
	}
}