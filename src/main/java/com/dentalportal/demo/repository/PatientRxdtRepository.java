package com.dentalportal.demo.repository;

import com.dentalportal.demo.Entity.Patient;
import com.dentalportal.demo.Entity.PatientRxdt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface PatientRxdtRepository extends JpaRepository<PatientRxdt, BigDecimal> {
}
