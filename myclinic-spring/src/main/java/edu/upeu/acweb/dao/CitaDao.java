package edu.upeu.acweb.dao;

import java.util.Date;
import java.util.List;

import edu.upeu.acweb.domain.Cita;

public interface CitaDao {

	void guardarCita(Cita cita);
	void eliminarCita(Cita cita);
	List<Cita> getListaCitas();
	List<Cita> getListaCitasPorUsuario(String idUsuario);
	List<Cita> getListaCitasPorUsuarioFecha(String idUsuario, Date fecha);
	List<Cita> getListaCitasPorMedico(String idMedico);
	List<Cita> getListaCitasPorEspecialidad(String idEspecialidad);
}
