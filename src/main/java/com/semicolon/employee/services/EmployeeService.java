package com.semicolon.employee.services;

import com.semicolon.employee.dto.EmployeeCreationRequest;
import com.semicolon.employee.dto.EmployeeResponse;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

    EmployeeResponse createEmployee(EmployeeCreationRequest employeeCreationRequest);

    EmployeeResponse findEmployeeById(long employeeId);
}
