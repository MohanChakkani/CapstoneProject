package com.capstone.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.project.dto.EmployeDTO;
import com.capstone.project.entity.Employee;
import com.capstone.project.exception.EmployeeIDException;
import com.capstone.project.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	IEmployeeService service;
	
	@GetMapping("/{employeeID}")
    public Employee getEmployeeById(int employeeID) throws EmployeeIDException {
		return service.getEmployeeByEmployeeId(employeeID);
        
    }
}
