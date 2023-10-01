package com.example.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.models.Empleo;
import com.example.crud.services.IEmpleoService;

@RestController
@RequestMapping("/empleo")
public class EmpleoController {
	
	@Autowired
	private IEmpleoService empleoService;
	
	@GetMapping("/{id}/buscarEmpleo")
	public Empleo listarEmpleo(@PathVariable("id") int id) {
		return empleoService.buscarEmpleoPorId(id);
	}
	@PostMapping("/guardar")
	public Empleo guardarEmpleo(@RequestBody Empleo e) {
		return empleoService.guardarEmpleo(e);
	}
	@PutMapping("/{id}/actualizar")
	public Empleo actualizaPersona(@PathVariable("id") int id,@RequestBody Empleo empleoNew ) {
		return empleoService.modificarEmpleo(id,empleoNew);
	}
	@PostMapping("/{id}/delete")
	public String eleminarPersona(@PathVariable("id") int id) {
		return empleoService.eliminarEmpleo(id);
	}

}
