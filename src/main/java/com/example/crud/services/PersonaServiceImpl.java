package com.example.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.dao.IPersonaDao;
import com.example.crud.models.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private IPersonaDao personaDao;
	
	@Override
	public List<Persona> listarPersona() {
		// TODO Auto-generated method stub
		return (List<Persona>)personaDao.findAll();
	}

	@Override
	public Persona guardarPersona(Persona p) {
		// TODO Auto-generated method stub
		return personaDao.save(p);
	}

	@Override
	public Persona modificarPersona(int id, Persona personaNew) {
		// TODO Auto-generated method stub
		Persona personaOld = buscarPersonaPorId(id);
		personaOld.setNombre(personaNew.getNombre());
		
		return personaDao.save(personaOld);
	}
	
	@Override
	public String eliminarPersona(Persona p) {
		// TODO Auto-generated method stub
		personaDao.delete(p);
		
		return "Hecho";
	}
	@Override
	public Persona buscarPersonaPorId(int id) {
		// TODO Auto-generated method stub
		
		return personaDao.findById(id).orElse(null);
	}

}
