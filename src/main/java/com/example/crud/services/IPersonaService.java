package com.example.crud.services;

import java.util.List;

import com.example.crud.models.Persona;

public interface IPersonaService {
	public List<Persona> listarPersona();
	public Persona guardarPersona(Persona p);
	public Persona modificarPersona(int id,Persona personaNew);
	public String eliminarPersona(Persona p);
	public Persona buscarPersonaPorId(int id);
	
}
