package com.example.crud.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CALCULADORA")
public class Calculadora {
	@Id
	private int id=1;
	@Column
	private double primerNumero=10;
	private double segundoNumero=5;
	private String operador="/";
	
	public String getOperador() {
		return operador;
	}
	public void setOperador(String operador) {
		this.operador = operador;
	}
	public double getPrimerNumero() {
		return primerNumero;
	}
	public void setPrimerNumero(double primerNumero) {
		this.primerNumero = primerNumero;
	}
	public double getSegundoNumero() {
		return segundoNumero;
	}
	public void setSegundoNumero(double segundoNumero) {
		this.segundoNumero = segundoNumero;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
