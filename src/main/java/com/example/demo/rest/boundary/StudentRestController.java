package com.example.demo.rest.boundary;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stud")
public class StudentRestController {

	@RequestMapping("/students")
	public ResponseEntity<?> getStudents(){
		String lStudents = "hallo";
		ResponseEntity.status(HttpStatus.OK).body(lStudents);
	}
}
