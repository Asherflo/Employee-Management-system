package com.semicolon.employee.dto.request;

import com.semicolon.employee.data.enums.Department;
import com.semicolon.employee.data.enums.Gender;
import com.semicolon.employee.data.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeCreationRequest {
    private String firstName;
    private  String lastName;
    private String email;
    private Gender gender;
    private String address;
    private String employeeId;
    private String phoneNUmber;
    private Department department;
    private String dateOfBirth;
    private Status employeeStatus;

    private String dataJoined;
    private boolean suspended;


}
