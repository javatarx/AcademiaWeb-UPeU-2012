package edu.upeu.acweb.dao;

import java.util.List;

import edu.upeu.acweb.domain.Medico;

public interface MedicoDao {

	List<Medico> getListaMedicos();
	List<Medico> getListaMedicosPorEspecialidad(String idEspecialidad);
	
}
