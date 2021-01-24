package com.dentalportal.demo.repository;

import com.dentalportal.demo.Entity.Rxm;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface RxmRepository extends JpaRepository<Rxm, BigDecimal> {
}
