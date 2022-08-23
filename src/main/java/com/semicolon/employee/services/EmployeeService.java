package com.semicolon.employee.services;

import com.semicolon.employee.dto.request.EmployeeCreationRequest;
import com.semicolon.employee.dto.response.EmployeeResponse;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

    EmployeeResponse createEmployee(EmployeeCreationRequest employeeCreationRequest);

    EmployeeResponse findEmployeeById(long employeeId);
}
