package com.emp.database.Repositrory;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.emp.database.Model.Employee;

@Service
public class EmployeeRepo 
{
	@Autowired
	private EmployeeRepo empRepo;
	
	private List<Employee> empList;
	public EmployeeRepo()
	{
		empList = Arrays.asList(new Employee(1,"Jhonny Deep","IT",25000.67, 9875232467l,"jhony@gmail.com"),
				new Employee(2,"Adamp Zampa","IT",35500.37, 9871132467l,"zampa@gmail.com"),
				new Employee(3,"Rose Tayloar","Sales",45000.23, 8275232467l,"Rose@gmail.com"),
				new Employee(4,"Alan Walker","Technical",75800.89, 8675032467l,"alan@gmail.com"),
				new Employee(5,"Jhonny Dary","Sales",23000.67, 6175232467l,"dary@gmail.com"),
				new Employee(6,"Glenn Maxwell","Accounts",85000.89, 875232000l,"glenn.maxi@gmail.com"),
				new Employee(7,"Richard Andreson","Accounts",125000.67, 6875232467l,"richy.anny@gmail.com"));
	}
	
	public List<Employee> fetchAllStudentsDetails() 
	{
		return empList;
	}

}
