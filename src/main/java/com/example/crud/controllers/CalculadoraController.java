package com.example.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.crud.models.Calculadora;
import com.example.crud.services.ICalculadoraService;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	@Autowired
	private ICalculadoraService calculadoraService;
	
	
	@PostMapping("/calcular")
	public String realizarCalculo(@RequestBody Calculadora calculadora) {
		return calculadoraService.realizarCalculoResultado(calculadora);
	}
}
