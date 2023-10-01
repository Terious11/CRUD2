package com.example.crud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.dao.IEmpleoDao;
import com.example.crud.models.Empleo;

@Service
public class EmpleoServiceImpl implements IEmpleoService {

	@Autowired
	private IEmpleoDao empleoDao;

	@Override
	public Empleo guardarEmpleo(Empleo e) {
		// TODO Auto-generated method stub
		return empleoDao.save(e);
	}

	@Override
	public Empleo modificarEmpleo(int id, Empleo empleoNew) {
		// TODO Auto-generated method stub
		Empleo empleoOld = buscarEmpleoPorId(id);
		empleoOld.setActividades(empleoNew.getActividades());
		empleoOld.setPuesto(empleoNew.getPuesto());
		empleoOld.setTelefono(empleoNew.getTelefono());

		return empleoDao.save(empleoOld);
	}

	@Override
	public String eliminarEmpleo(int id) {
		// TODO Auto-generated method stub
		empleoDao.deleteById(id);
		
		return "Hecho";
	}

	@Override
	public Empleo buscarEmpleoPorId(int id) {
		// TODO Auto-generated method stub
		return empleoDao.findById(id).orElse(null);
	}

}
