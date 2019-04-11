package com.example.demo.boundary;

import com.example.demo.domain.Student;
import com.example.demo.repositories.StudentRepository;
import com.example.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class StudController {
//
//	@Autowired
//	private StudentRepository studentRepository;

	@Autowired
	private StudentService studentService;

	//
//	@Autowired
//	public StudController(StudentRepository studentRepository, StudentService studentService) {
//		this.studentRepository = studentRepository;
//		this.studentService = studentService;
//	}


	@GetMapping("/student")
//	public String getFirstPAge(Model model) {
//		return "stud";

	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}

	}



