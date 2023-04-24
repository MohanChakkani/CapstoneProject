package com.capstone.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capstone.project.entity.Employee;
import com.capstone.project.exception.EmployeeIDException;

@RestController
@RequestMapping("/api/Rest/Employee")
public class Controller {
	@Autowired
	RestTemplate resttemplate;
	String baseUrl = "https://localhost:9090/employee/";

	@GetMapping("/{employeeID}")
    public Employee getEmployeeById(@PathVariable int employeeID) throws EmployeeIDException {
        Employee employee = resttemplate.getForObject(baseUrl +employeeID, Employee.class);
        if (employee == null) {
            throw new EmployeeIDException("Employee not found with ID: " + employeeID);
        }
        return employee;
    }
	
	

}
