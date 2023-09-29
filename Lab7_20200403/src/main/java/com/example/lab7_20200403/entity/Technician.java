package com.example.lab7_20200403.entity;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "technician")
public class Technician {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TechnicianID", nullable = false)
    private Integer id;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "Phone", length = 9)
    private String phone;

    @Column(name = "Dni", nullable = false, length = 8)
    private String dni;

    @Column(name = "Age", nullable = false)
    private Integer age;

}