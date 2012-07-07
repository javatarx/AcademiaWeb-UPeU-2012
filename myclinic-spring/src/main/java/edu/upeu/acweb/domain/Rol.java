package edu.upeu.acweb.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="ROL")
public class Rol implements Serializable{

	private static final long serialVersionUID = -1271619509144489129L;

	@Id
	@GeneratedValue(generator="genId") 
	@GenericGenerator(name="genId", strategy="uuid")
	@Column(name="idRol",length=32)
	private String id;
	private String nombre;
	private boolean estado;

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
}
