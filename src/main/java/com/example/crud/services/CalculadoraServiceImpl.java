package com.example.crud.services;

import org.springframework.stereotype.Service;

import com.example.crud.models.Calculadora;

@Service
public class CalculadoraServiceImpl implements ICalculadoraService {


	@Override
	public String realizarCalculoResultado(Calculadora calculadora) {
		// TODO Auto-generated method stub
		double primerNumero;
		double segundoNumero;
		String operador;
		double resultado = 0.0;
		primerNumero = calculadora.getPrimerNumero();
		segundoNumero = calculadora.getSegundoNumero();
		operador = calculadora.getOperador();
		
		switch (operador) {
		case "+":
			resultado = primerNumero + segundoNumero;
			break;
		case "-":
			resultado = primerNumero - segundoNumero;
			break;
		case "*":
			resultado = primerNumero * segundoNumero;
			break;
		case "/":
			resultado = primerNumero/segundoNumero;
			break;
		}
		
		return Double.toString(resultado);
	}

}
