package com.example.crud.service.impl;

import com.example.crud.entity.Employee;
import com.example.crud.repository.EmployeeRepository;
import com.example.crud.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by HachNV on 12/05/2023
 */
@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public void create(Employee employee) {
        Employee em = new Employee();
        em.setName(employee.getName());
        em.setPhone(employee.getPhone());
        em.setAddress(employee.getAddress());
        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getList() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("employee not exist"));
    }

    @Override
    public void updateEmployee(Long id, Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
