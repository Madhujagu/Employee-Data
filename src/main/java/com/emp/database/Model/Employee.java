package com.emp.database.Model;

public class Employee 
{
	private int empid;
	private String empName;
	private String empDepartment;
	private double empSalary;
	private long phoneNumber;
	private String empEmail;
	
	public Employee() 
	{
		super();
	}

	public Employee(int empid, String empName, String empDepartment, double empSalary, long phoneNumber,
			String empEmail) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empDepartment = empDepartment;
		this.empSalary = empSalary;
		this.phoneNumber = phoneNumber;
		this.empEmail = empEmail;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empDepartment=" + empDepartment + ", empSalary="
				+ empSalary + ", phoneNumber=" + phoneNumber + ", empEmail=" + empEmail + "]";
	}
	
	
	
	
	

}
