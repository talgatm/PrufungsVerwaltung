package com.example.demo.repositories;

import com.example.demo.domain.Lehrveranstaltung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LehrveranstaltungRepository extends JpaRepository <Lehrveranstaltung, Long> {
}
