package com.example.lab4_20203651.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "employees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", nullable = false)
    private Integer employee_id;

    @Column(name = "first_name", length = 20, nullable = true)
    private String first_name;

    @Column(name = "last_name", nullable = false, length = 25)
    private String last_name;

    @Column(name = "Puesto", nullable = false, length = 25, unique = true)
    private String Puesto;

    @Column(name = "Departamento", nullable = true, length = 65)
    private String Departamento;

    @Column(name = "Ciudad", nullable = true, length = 20)
    private String Ciudad;

    @Column(name = "phone_number", nullable = true, length = 45)
    private String phone_number;

    @Column(name = "salary", nullable = true)
    private Double salary;




}
