package com.idat.Eva1Prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.Eva1Prueba.model.Profesor;
import com.idat.Eva1Prueba.repository.ProfesorRepository;

public class ProfesorServiceImpl {

	@Autowired
	private ProfesorRepository repository;

	public void guardarProducto(Profesor profesor) {
		// TODO Auto-generated method stub
		repository.save(profesor);
		
	}

	public void actualizarProfesor(Profesor profesor) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(profesor);
		
	}

	public void eliminarProfesor(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	public List<Profesor> listarProfesor() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public Profesor obtenerProfesorId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	
	
}
