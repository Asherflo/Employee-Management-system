package com.semicolon.employee.data.model;

import com.semicolon.employee.data.enums.Department;
import com.semicolon.employee.data.enums.Gender;
import com.semicolon.employee.data.enums.Status;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @NotNull
    private  String firstName;
    @NotNull
    private String lastName;
    @NotNull
    @Email
    private String email;
    private String address;
    private String phoneNUmber;
    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    @Enumerated(value = EnumType.STRING)
    private Department department;

    private String dataJoined;

    private String employeesId;
    private String dob;

    @Enumerated(value = EnumType.STRING)
    private Status employeeStatus;

    private boolean suspended;



}
