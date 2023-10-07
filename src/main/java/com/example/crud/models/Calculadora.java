package com.example.crud.models;

public class Calculadora {
	
	private double primerNumero;
	private double segundoNumero;
	private String operador;
	
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

}
