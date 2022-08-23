package com.semicolon.employee.exception;

public class DuplicateAccountException extends EmployeeDoesNotExitException{
    public DuplicateAccountException(String message) {
        super(message);
    }
}
