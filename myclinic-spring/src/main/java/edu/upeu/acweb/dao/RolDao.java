package edu.upeu.acweb.dao;

import java.util.List;

import edu.upeu.acweb.domain.Rol;

public interface RolDao {

	Rol getRolPorId(String idRol);
	List<Rol> getListaRoles();
}
