package com.test.rest;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeResource {
	
	@Autowired
	EmployeeService employeeService;
	
	@GET
	@RequestMapping("/details/{id}")
	public Employee getEmployeeById(@PathVariable("id") int id) {
		return employeeService.getEmployeeById(id);
	}
	
	@POST
	@RequestMapping("create")
	public ResponseEntity createEmployee(@RequestBody Employee e) {
		System.out.println("Employee ID"+ e.getEmployeeId());
		return new ResponseEntity<Employee>(HttpStatus.CREATED);
	}
}
