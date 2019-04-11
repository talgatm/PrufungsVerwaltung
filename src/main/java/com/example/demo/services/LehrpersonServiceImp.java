package com.example.demo.services;


import com.example.demo.domain.Lehrperson;
import com.example.demo.repositories.LehrpersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LehrpersonServiceImp implements LehrpersonService {

	@Autowired
	LehrpersonRepository lehrpersonRepository;

	@Override
	public void save(Lehrperson lehrperson) {
		lehrpersonRepository.save(lehrperson);
	}

	@Override
	public List<Lehrperson> getAllLehrpersons() {
		return lehrpersonRepository.findAll();
	}
}
