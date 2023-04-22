package com.capstone.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.project.entity.Employee;
import com.capstone.project.exception.EmployeeIDException;
import com.capstone.project.repo.EmployeRepo;
@Service
public class EmployeeServiceImp implements IEmployeeService {
	@Autowired
	EmployeRepo repo;

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) throws EmployeeIDException {
		Employee employee = repo.findById(employeeId).orElse(null);
		if(employee != null) {
			return employee;
		}
		else {
			throw new EmployeeIDException("Invalid EmployeeID");
		}
		
	}
	
	
	

}
