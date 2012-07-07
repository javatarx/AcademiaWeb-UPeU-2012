package edu.upeu.acweb.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="CITA")
public class Cita implements Serializable {

	private static final long serialVersionUID = -5689449862767826216L;

	@Id
	@GeneratedValue(generator="genId") 
	@GenericGenerator(name="genId", strategy="uuid")
	@Column(name="idCita",length=32)
	private String id;
	private Date fechaCita;
	private String horario;
	private String comentario;
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;
	@ManyToOne
	@JoinColumn(name="idMedico")
	private Medico medico;
	@ManyToOne
	@JoinColumn(name="idEspecialidad")
	private Especialidad especialidad;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getFecha() {
		return fechaCita;
	}
	public void setFecha(Date fecha) {
		this.fechaCita = fecha;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	
}
