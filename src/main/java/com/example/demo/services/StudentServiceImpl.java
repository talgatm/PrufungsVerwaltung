package com.example.demo.services;

import com.example.demo.domain.Student;
import com.example.demo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void save(Student student) {
		studentRepository.save(student);

	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
}
