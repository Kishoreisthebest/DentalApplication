package com.dentalportal.demo.repository;

import com.dentalportal.demo.Entity.Treatm;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface TreatmRepository extends JpaRepository<Treatm, BigDecimal> {
}
