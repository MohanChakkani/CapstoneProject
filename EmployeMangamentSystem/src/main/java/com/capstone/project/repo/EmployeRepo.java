package com.capstone.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.project.entity.Employee;

@Repository
public interface EmployeRepo extends JpaRepository<Employee, Integer>{
	//Employee findByEmployeeID(int employeeID);

}
