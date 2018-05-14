package com.test.rest;

import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

	
	public Employee getEmployeeById(int id) {
		return new Employee(1,"Rahul"); 
	}
}
