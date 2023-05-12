package com.example.crud.controller;

import com.example.crud.entity.Employee;
import com.example.crud.service.impl.EmployeeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by HachNV on 12/05/2023
 */
@RequestMapping("/employee")
@RestController
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeServiceImpl employeeService;
    @GetMapping("list")
    public ResponseEntity<List<Employee>> getList() {
        List<Employee> employee = employeeService.getList();
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        Employee em = employeeService.getEmployeeById(id);
        return new ResponseEntity<>(em, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> createEmployee(Employee employee) {
        employeeService.create(employee);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<String> updateEmployee(@PathVariable Long id, Employee employee) {
        employeeService.updateEmployee(id, employee);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
}
