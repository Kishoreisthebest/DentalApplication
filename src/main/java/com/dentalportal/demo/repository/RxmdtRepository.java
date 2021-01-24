package com.dentalportal.demo.repository;

import com.dentalportal.demo.Entity.RxmDt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface RxmdtRepository extends JpaRepository<RxmDt, BigDecimal> {
}
