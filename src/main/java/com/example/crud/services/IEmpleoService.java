package com.example.crud.services;

import com.example.crud.models.Empleo;

public interface IEmpleoService {

	public Empleo guardarEmpleo(Empleo e);
	public Empleo modificarEmpleo(int id,Empleo empleoNew);
	public String eliminarEmpleo(int id);
	public Empleo buscarEmpleoPorId(int id);
}
