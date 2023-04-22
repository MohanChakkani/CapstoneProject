package com.capstone.project.service;

import com.capstone.project.entity.Employee;
import com.capstone.project.exception.EmployeeIDException;

public interface IEmployeeService {
	public Employee getEmployeeByEmployeeId(int employeeId) throws EmployeeIDException;
}