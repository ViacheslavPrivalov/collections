package com.example.colllections.service;

import com.example.colllections.model.Employee;

import java.util.Collection;

public interface EmployeeBookService {
    Employee addEmployee(String firstName, String lastName);
    Employee removeEmployee(String firstName, String lastName);
    Employee findEmployee(String firstName, String lastName);

    Collection<Employee> findAll();
}
