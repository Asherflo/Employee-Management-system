package com.semicolon.employee.data.repositories;

import com.semicolon.employee.data.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
