package com.example.demo.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Student {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	@ManyToMany
	@JoinTable(name = "studenten_lehrverantaltungen", joinColumns = @JoinColumn(name = "student_id"),
	inverseJoinColumns = @JoinColumn (name = "lehrverantaltung_id"))
	private Set<Lehrveranstaltung> lehrveranstaltungen= new HashSet<>();

	public Student() {	
	}

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return Objects.equals(id, student.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
