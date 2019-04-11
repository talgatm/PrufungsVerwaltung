package com.example.demo.repositories;

import com.example.demo.domain.Pruefung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PruefungRepository extends JpaRepository <Pruefung, Long> {
}
