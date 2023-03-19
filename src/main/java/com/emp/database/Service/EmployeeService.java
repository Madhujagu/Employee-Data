package com.emp.database.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.emp.database.Model.Employee;
import com.emp.database.Repositrory.EmployeeRepo;

@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeRepo empRepo;
	
	
	public List<Employee> getAllStudentDetails() 
	{
		return empRepo.fetchAllStudentsDetails();
	}

}
