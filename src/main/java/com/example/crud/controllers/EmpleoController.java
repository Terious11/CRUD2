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

import com.example.crud.models.Empleo;
import com.example.crud.services.IEmpleoService;

@RestController
@RequestMapping("/employment")
public class EmpleoController {
	
	@Autowired
	private IEmpleoService empleoService;
	
	@GetMapping("/{id}/findEmploymentById")
	public Empleo findEmploymentById(@PathVariable("id") int id) {
		return empleoService.findEmploymentById(id);
	}
	@PostMapping("/saveEmployment")
	public Empleo saveEmployment(@RequestBody Empleo employmentSave) {
		return empleoService.saveEmployment(employmentSave);
	}
	@PutMapping("/{id}/updateEmployment")
	public Empleo updateEmployment(@PathVariable("id") int id,@RequestBody Empleo empleoNew ) {
		return empleoService.updateEmployment(id,empleoNew);
	}
	@PostMapping("/{id}/deleteEmployment")
	public String deleteEmployment(@PathVariable("id") int id) {
		return empleoService.deleteEmployment(id);
	}
	@GetMapping("/findEmpleoyment")
	public List<Empleo> findEmpleoyment() {
		List<Empleo> empleoList = new ArrayList<>();
		empleoList = empleoService.findEmployment();
		return empleoList;
		}

}
