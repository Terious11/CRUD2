package com.example.crud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.dao.ICalculadoraDao;
import com.example.crud.models.Calculadora;

@Service
public class CalculadoraServiceImpl implements ICalculadoraService {

	@Autowired
	private ICalculadoraDao calculadoraDao;

	@Override
	public String realizarCalculoResultado(Calculadora calculadora) {
		// TODO Auto-generated method stub
		double primerNumero;
		double segundoNumero;
		String operador;
		double resultado =0.0;
		String r;
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
		r= Double.toString(resultado);
		return r;
	}

}
