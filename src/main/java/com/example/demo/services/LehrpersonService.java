package com.example.demo.services;

import com.example.demo.domain.Lehrperson;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface LehrpersonService {
	void save (Lehrperson lehrperson);

	List<Lehrperson> getAllLehrpersons();
}
