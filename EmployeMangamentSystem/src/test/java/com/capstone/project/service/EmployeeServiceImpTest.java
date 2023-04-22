package com.capstone.project.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capstone.project.entity.Employee;
import com.capstone.project.exception.EmployeeIDException;
@SpringBootTest
class EmployeeServiceImpTest {

	@Autowired
	private IEmployeeService service;
	
	@Test
	void testGetEmployeeByEmployeeId() throws EmployeeIDException{
		Employee employee = service.getEmployeeByEmployeeId(1);
		assertNotNull(employee);
		assertEquals(1, employee.getEmployeeId());
	}
}
