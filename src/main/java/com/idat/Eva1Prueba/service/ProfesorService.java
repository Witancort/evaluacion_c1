package com.idat.Eva1Prueba.service;

import java.util.List;

import com.idat.Eva1Prueba.model.Profesor;

public interface ProfesorService {
	
	void guardarProducto(Profesor profesor);
	void actualizarProfesor(Profesor profesor);
	void eliminarProfesor(Integer id);
	List<Profesor> listarProfesor();
	Profesor obtenerProfesorId(Integer id);


}
