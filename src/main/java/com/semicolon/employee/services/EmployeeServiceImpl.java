package com.semicolon.employee.services;

import com.semicolon.employee.data.enums.Gender;
import com.semicolon.employee.data.enums.Status;
import com.semicolon.employee.data.model.Employee;
import com.semicolon.employee.data.repositories.EmployeeRepository;
import com.semicolon.employee.dto.request.EmployeeCreationRequest;
import com.semicolon.employee.dto.response.EmployeeResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor

public class EmployeeServiceImpl implements  EmployeeService{
    private final EmployeeRepository employeeRepository;
    @Override
    public EmployeeResponse createEmployee(EmployeeCreationRequest employeeCreationRequest) {
//        Employee  employee = new Employee();
//        employee.setFirstName(employeeCreationRequest.getFirstName());
//        employee.setLastName(employeeCreationRequest.getLastName());
//        employee.setAddress(employeeCreationRequest.getAddress());
//        employee.setDepartment(Department.ADMIN);
//        employee.setGender(Gender.FEMALE);


        Employee employee = Employee.builder()
                .firstName(employeeCreationRequest.getFirstName())
                .lastName(employeeCreationRequest.getLastName())
                .address(employeeCreationRequest.getAddress())
                .email(employeeCreationRequest.getEmail())
                .gender(Gender.FEMALE)
                .employeesId(generateEmployeeId())
                .employeeStatus(Status.SENIOR)
                .phoneNUmber(employeeCreationRequest.getPhoneNUmber())
                .dataJoined(employeeCreationRequest.getDataJoined())
                .department(employeeCreationRequest.getDepartment())
                .build();
        Employee savedEmployee = employeeRepository.save(employee);
        EmployeeResponse response = new EmployeeResponse();
        response.setMessage("Successfully created");
        response.setEmployee(savedEmployee);
        return response;
    }

    @Override
    public EmployeeResponse findEmployeeById(long employeeId) {
         Optional<Employee> employeeResp = employeeRepository.findAllById(employeeId);
         Employee employee =employeeResp.get();
         EmployeeResponse  employeeResponse = new EmployeeResponse();
         employeeResponse.setMessage("seen");
         employeeResponse.setEmployee(employee);
        return employeeResponse;
    }

    public  String generateEmployeeId(){
        int number = employeeRepository.findAll().size();
        String id = String.format("%02d", number);
        return "EM"+id;
    }


}
