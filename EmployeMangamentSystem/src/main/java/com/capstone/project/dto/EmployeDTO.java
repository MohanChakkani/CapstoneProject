package com.capstone.project.dto;

import java.sql.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeDTO {
	@Positive(message = "Employee ID must be a positive integer")
    private int employeeID;
    
    @NotBlank(message = "Employee name is required")
    private String employeeName;
    
    @NotNull(message = "Date of birth is required")
    @Past(message = "Date of birth must be in the past")
    private Date dateOfBirth;
}
