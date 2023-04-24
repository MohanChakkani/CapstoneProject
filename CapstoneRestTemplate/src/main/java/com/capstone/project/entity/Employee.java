package com.capstone.project.entity;

import java.sql.Date;







public class Employee {
	
	
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "EmployeeID")
    private int employeeId;
    
    //@Column(name = "EmployeeName")
    private String employeeName;
    
    //@Column(name = "DateOfBirth")
    private Date dateOfBirth;
    
    public Employee() {
		// TODO Auto-generated constructor stub
    	super();
	}
    

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", dateOfBirth=" + dateOfBirth
				+ "]";
	}

	public Employee(int employeeId, String employeeName, Date dateOfBirth) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dateOfBirth = dateOfBirth;
	}
    

}
