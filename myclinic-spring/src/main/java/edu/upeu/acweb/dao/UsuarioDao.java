package edu.upeu.acweb.dao;

import java.util.List;

import edu.upeu.acweb.domain.Usuario;

public interface UsuarioDao {

	Usuario validarInicioSesionUsuario(String login, String passwd);
	List<Usuario> getListaUsuarios();
	Usuario getUsuarioPorId(String idUsuario);
	void guardarUsuario(Usuario usuario);
}
