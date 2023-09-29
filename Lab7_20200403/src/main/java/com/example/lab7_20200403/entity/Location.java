package com.example.lab7_20200403.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LocationID", nullable = false)
    private Integer id;

    @Column(name = "City")
    private String city;

    @Column(name = "Country")
    private String country;

}