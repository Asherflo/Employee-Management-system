package com.semicolon.employee.dto;

import com.semicolon.employee.data.model.Employee;
import lombok.Data;

@Data
public class EmployeeResponse {
    private  String message;
    private Employee employee;
}
