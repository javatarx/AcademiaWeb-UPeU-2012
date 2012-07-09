package edu.upeu.acweb.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import edu.upeu.acweb.dao.UsuarioDao;
import edu.upeu.acweb.domain.Usuario;
import edu.upeu.acweb.util.Constantes;

@Repository
public class UsuarioDaoHibernateImpl implements UsuarioDao{

	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public Usuario validarInicioSesionUsuario(String login, String passwd) {
		return (Usuario) sessionFactory.getCurrentSession()
				.createCriteria(Usuario.class)
				.add(Restrictions.eq("username", login))
				.add(Restrictions.eq("passwd", passwd))
				.add(Restrictions.eq("estado", Constantes.ESTADO_ACTIVADO))
				.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> getListaUsuarios() {
		return  sessionFactory.getCurrentSession()
				.createCriteria(Usuario.class)
				.list();
	}

	@Override
	public Usuario getUsuarioPorId(String idUsuario) {
		return  (Usuario) sessionFactory.getCurrentSession()
				.createCriteria(Usuario.class)
				.add(Restrictions.idEq(idUsuario))
				.uniqueResult();
	}

	@Override
	public void guardarUsuario(Usuario usuario) {
		sessionFactory.getCurrentSession().save(usuario);
	}

}
