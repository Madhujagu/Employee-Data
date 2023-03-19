package com.emp.database.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.database.Model.Employee;
import com.emp.database.Service.EmployeeService;

@RestController
public class EmployeeController 
{
	@Autowired
	EmployeeService empServe;
	
	@GetMapping
	public List<Employee> getAllStudents()
	{
		return empServe.getAllStudentDetails();
	}
	
}
