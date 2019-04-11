package com.example.demo.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

public class Pruefungsvorleistung {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	private Lehrveranstaltung lehrveranstaltung;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Pruefungsvorleistung that = (Pruefungsvorleistung) o;
		return Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	public Pruefungsvorleistung() {
	}

	public Pruefungsvorleistung(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
