package com.example.crud.services;

import java.util.List;

import com.example.crud.models.Empleo;

public interface IEmpleoService {

	public Empleo saveEmployment(Empleo empleoSave);
	public Empleo updateEmployment(int id,Empleo empleoNew);
	public String deleteEmployment(int id);
	public Empleo findEmploymentById(int id);
	public List<Empleo> findEmployment();
}
