package com.semicolon.employee.controller;

import com.semicolon.employee.dto.request.EmployeeCreationRequest;
import com.semicolon.employee.dto.response.ApiResponse;
import com.semicolon.employee.dto.response.EmployeeResponse;
import com.semicolon.employee.exception.DuplicateAccountException;
import com.semicolon.employee.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@AllArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping("/register")
    public ResponseEntity<?> createEmployee(@RequestBody EmployeeCreationRequest request) {
        try {
            EmployeeResponse employeeResponse = employeeService.createEmployee(request);
            ApiResponse apiResponse  = new ApiResponse(true,employeeResponse);
            return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
        }
        catch (DuplicateAccountException e){
            ApiResponse apiResponse = new ApiResponse(false,e.getMessage());
            return new ResponseEntity<>(apiResponse,HttpStatus.BAD_REQUEST);
        }

        }



}