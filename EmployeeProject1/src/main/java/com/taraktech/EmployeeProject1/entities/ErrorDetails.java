package com.taraktech.EmployeeProject1.entities;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDetails {
	private Date timetamp;
	private String details;
}
