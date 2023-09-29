package com.example.lab7_20200403.repository;

import com.example.lab7_20200403.entity.Technician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnicianRepository extends JpaRepository<Technician,Integer> {
}
