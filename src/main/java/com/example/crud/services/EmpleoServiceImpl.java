package com.example.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.dao.IEmpleoDao;
import com.example.crud.models.Empleo;

@Service
public class EmpleoServiceImpl implements IEmpleoService {

	@Autowired
	private IEmpleoDao employmentDao;

	@Override
	public Empleo saveEmployment(Empleo employmentSave) {
		// TODO Auto-generated method stub
		return employmentDao.save(employmentSave);
	}

	@Override
	public Empleo updateEmployment(int id, Empleo empleoNew) {
		// TODO Auto-generated method stub
		Empleo empleoOld = findEmploymentById(id);
		empleoOld.setActividades(empleoNew.getActividades());
		empleoOld.setPuesto(empleoNew.getPuesto());
		empleoOld.setTelefono(empleoNew.getTelefono());

		return employmentDao.save(empleoOld);
	}

	@Override
	public String deleteEmployment(int id) {
		// TODO Auto-generated method stub
		employmentDao.deleteById(id);
		
		return "Hecho";
	}

	@Override
	public Empleo findEmploymentById(int id) {
		// TODO Auto-generated method stub
		return employmentDao.findById(id).orElse(null);
	}
	
	@Override
	public List<Empleo> findEmployment() {
		
		return (List<Empleo>)employmentDao.findAll();
	}

}
