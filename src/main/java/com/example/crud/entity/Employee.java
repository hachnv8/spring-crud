package com.example.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * Created by HachNV on 12/05/2023
 */
@Entity
@Data
public class Employee {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String address;
    private int phone;
}
