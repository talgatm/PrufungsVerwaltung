package com.example.demo.config;

import com.example.demo.domain.Lehrperson;
import com.example.demo.domain.Student;
import com.example.demo.repositories.LehrpersonRepository;
import com.example.demo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class Dbconfig {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	LehrpersonRepository lehrpersonRepository;

	@PostConstruct
	public void Init (){
		studentRepository.save(new Student("Talgat Melisbekov"));
		studentRepository.save(new Student("Kalys Nurmanbetov"));

	}
}
