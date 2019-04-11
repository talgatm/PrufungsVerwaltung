package com.example.demo.repositories;

import com.example.demo.domain.Pruefungsvorleistung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PruefungsvorleistungRepository extends JpaRepository <Pruefungsvorleistung, Long>{
}
