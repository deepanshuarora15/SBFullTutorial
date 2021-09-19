package com.dailycodebuffer.springBoot.tutorial.exception;

public class DepartmentNotFoundException extends Exception {
    public DepartmentNotFoundException() {
    }

    public DepartmentNotFoundException(String message) {
        super(message);
    }

}
