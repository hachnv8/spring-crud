package com.example.crud.service;

import com.example.crud.entity.Employee;

import java.util.List;

/**
 * Created by HachNV on 12/05/2023
 */
public interface EmployeeService {
    void create(Employee employee);
    List<Employee> getList();
    Employee getEmployeeById(Long id);
    void updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);
}
