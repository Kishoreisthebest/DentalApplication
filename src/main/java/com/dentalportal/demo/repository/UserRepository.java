package com.dentalportal.demo.repository;

import com.dentalportal.demo.Entity.Usr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Usr,String> {
}
