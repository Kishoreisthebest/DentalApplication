package com.dentalportal.demo.repository;

import com.dentalportal.demo.Entity.Clinic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface ClinicRepository extends JpaRepository<Clinic, BigDecimal> {
}
