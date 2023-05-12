package com.example.crud.repository;

import com.example.crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by HachNV on 12/05/2023
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
