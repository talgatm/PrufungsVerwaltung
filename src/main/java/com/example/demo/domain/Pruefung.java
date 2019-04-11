package com.example.demo.domain;

import javax.persistence.*;
import java.util.Objects;

public class Pruefung {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	private Lehrveranstaltung lehrveranstaltung;

	public Pruefung(Lehrveranstaltung lehrveranstaltung) {
		this.lehrveranstaltung = lehrveranstaltung;
	}
	public Pruefung() {
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Pruefung pruefung = (Pruefung) o;
		return Objects.equals(id, pruefung.id);
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
