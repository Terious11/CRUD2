package com.example.crud.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.crud.models.Calculadora;

public interface ICalculadoraDao extends CrudRepository<Calculadora, Integer> {

}
