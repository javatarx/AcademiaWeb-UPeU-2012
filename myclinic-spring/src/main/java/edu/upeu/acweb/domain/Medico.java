package edu.upeu.acweb.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="MEDICO")
public class Medico implements Serializable {

	private static final long serialVersionUID = -7746824039773805210L;

	@Id
	@GeneratedValue(generator="genId") 
	@GenericGenerator(name="genId", strategy="uuid")
	@Column(name="idMedico",length=32)
	private String id;
	private String nombre;
	private boolean estado;
	@ManyToOne
	@JoinColumn(name="idEspecialidad")
	private Especialidad especialidad;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
}
