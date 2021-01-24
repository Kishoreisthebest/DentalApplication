package com.dentalportal.demo.repository;

import com.dentalportal.demo.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface PatientRepository extends JpaRepository<Patient, BigDecimal> {
}
