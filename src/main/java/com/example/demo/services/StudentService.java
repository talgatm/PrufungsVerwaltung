package com.example.demo.services;

import com.example.demo.domain.Student;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public interface StudentService {
	void save (Student student);

	List<Student> getAllStudents();

}
