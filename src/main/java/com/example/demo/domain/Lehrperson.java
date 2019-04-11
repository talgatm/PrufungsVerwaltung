package com.example.demo.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Lehrperson {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	@ManyToMany
	@JoinTable(name = "lehrpersonen_lerveranstaltungen", joinColumns = @JoinColumn(name = "lehrperson_id"),
			inverseJoinColumns = @JoinColumn(name = "lerverantaltung_id") )
	private Set<Lehrveranstaltung> lehrveranstaltungen= new HashSet<>();

	public Lehrperson(Long id) {
		this.id = id;
	}

	public Lehrperson() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Lehrperson that = (Lehrperson) o;
		return Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
