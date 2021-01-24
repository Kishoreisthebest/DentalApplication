package com.dentalportal.demo.repository;

import com.dentalportal.demo.Entity.Audit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface AuditRepository extends JpaRepository<Audit, BigDecimal> {
}
