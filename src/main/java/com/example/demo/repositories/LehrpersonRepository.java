package com.example.demo.repositories;

import com.example.demo.domain.Lehrperson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LehrpersonRepository extends JpaRepository <Lehrperson, Long> {
}
