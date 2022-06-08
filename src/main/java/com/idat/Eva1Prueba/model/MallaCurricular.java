package com.idat.Eva1Prueba.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="MallaCurricular")
@Entity
public class MallaCurricular {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer idMalla;
	private Integer Anio;
	public Integer getIdMalla() {
		return idMalla;
	}
	public void setIdMalla(Integer idMalla) {
		this.idMalla = idMalla;
	}
	public Integer getAnio() {
		return Anio;
	}
	public void setAnio(Integer anio) {
		Anio = anio;
	}
	
	
	
	
	
}
