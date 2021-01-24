package com.dentalportal.demo.repository;

import com.dentalportal.demo.Entity.CaseFile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface CaseFileRepository extends JpaRepository<CaseFile, BigDecimal> {
}
