package com.example.demo.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Lehrveranstaltung {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToMany (mappedBy = "lehrveranstaltungen")
	private Set<Student> studenten = new HashSet<>();

	@ManyToMany (mappedBy = "lehrveranstaltungen")
	private Set<Lehrperson> lehrpersons = new HashSet<>();

	@OneToMany (mappedBy = "lehrveranstaltung")
	private Set<Pruefung> pruefungen = new HashSet<>();

	@OneToMany (mappedBy = "lehrveranstaltung")
	private Set <Pruefungsvorleistung> pruefungsvorleistungen = new HashSet<>();

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Lehrveranstaltung that = (Lehrveranstaltung) o;
		return Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
