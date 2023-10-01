package com.example.crud.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.crud.models.Persona;

public interface IPersonaDao extends CrudRepository<Persona,Integer>{
	
}
