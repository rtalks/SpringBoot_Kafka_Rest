package com.test.rest;

public class Employee {

	
	private int employeeId;
	
	private String employeeName;

	public Employee() {
	
	}
	
	public Employee(int i, String string) {
		this.employeeId = i;
		this.employeeName = string;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	
}
