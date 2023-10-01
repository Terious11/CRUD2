package com.example.crud.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PERSONAS")
public class Persona {
	@Column(name = "nombre")
	private String nombre;
	@Id
	private int id;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}


}
