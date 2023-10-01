package com.example.crud.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.models.Persona;
import com.example.crud.services.IPersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {

	@GetMapping("/hola")
	public String holaMundo() {
		return "Hola mundoxd";
	}

	@GetMapping("/tarea")
	public Persona sesionCinco() {
		Persona p = new Persona();
		p.setID(1);
		p.setNombre("Terious");
		p.setID(3);
		p.setNombre("Terious3");

		return p;
	}

	@GetMapping("/tarea2")
	public List<Persona> sesionSeis() {
		Persona p = new Persona();
		List<Persona> l = new ArrayList<>();
		p.setID(1);
		p.setNombre("Terious");
		p.setID(2);
		p.setNombre("Terious2");
		l.add(p);
		l.add(p);
		return l;
	}

	@Autowired
	private IPersonaService personaService;

	@GetMapping("/list")
	public List<Persona> listaPersona() {
		List<Persona> p = new ArrayList<>();
		p = personaService.listarPersona();
		return p;
	}

	@PostMapping("/save")
	public Persona guardarPersona(@RequestBody Persona p) {
		return personaService.guardarPersona(p);
	}
	@PostMapping("/delete")
	public String eleminarPersona(@RequestBody Persona p) {
		return personaService.eliminarPersona(p);
	}
	@PutMapping("/{id}/update")
	public Persona actualizaPersona(@PathVariable("id") int id,@RequestBody Persona personaNew ) {
		return personaService.modificarPersona(id,personaNew);
	}
	@GetMapping("/buscar/{id}")
	public Persona buscarPersona(@PathVariable("id") int id) {
		return personaService.buscarPersonaPorId(id);
	}
	
}
