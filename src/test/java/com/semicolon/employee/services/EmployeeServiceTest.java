package com.semicolon.employee.services;

import com.semicolon.employee.data.enums.Gender;
import com.semicolon.employee.data.enums.Status;
import com.semicolon.employee.dto.EmployeeCreationRequest;
import com.semicolon.employee.dto.EmployeeResponse;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.semicolon.employee.data.enums.Gender.FEMALE;
import static com.semicolon.employee.data.enums.Gender.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
@SpringBootTest

class EmployeeServiceTest {
    @Autowired
    private  EmployeeService employeeService;


    @BeforeEach
    void setUp() {
    }

    @AfterEach

    void tearDown() {
    }
    @Test
    @DisplayName("Employee can be created")
    void testThatEmployeeCanBeCreated(){
        EmployeeCreationRequest employeeCreationRequest = new EmployeeCreationRequest();
        employeeCreationRequest.setFirstName("seyi");
        employeeCreationRequest.setLastName("ademi");
        employeeCreationRequest.setGender(FEMALE);
        employeeCreationRequest.setEmail("ademi11@yahoo.com");
        employeeCreationRequest.setAddress("4,GodTimes street,yaba");
        employeeCreationRequest.setEmployeeStatus(Status.INTERN);
//        employeeCreationRequest.setDataJoined("");
//        employeeCreationRequest.setDateOfBirth("04-04-1967");
        EmployeeResponse response = employeeService.createEmployee(employeeCreationRequest);
        assertNotNull(response);
    }
    @Test
    @DisplayName("Retrieve A Employee")
    void testThatEmployeeCanBeRetrieve(){
        EmployeeResponse response =employeeService.findEmployeeById(1L);
        assertNotNull(response);
        assertEquals("tuple",response.getEmployee().getLastName());
    }

}