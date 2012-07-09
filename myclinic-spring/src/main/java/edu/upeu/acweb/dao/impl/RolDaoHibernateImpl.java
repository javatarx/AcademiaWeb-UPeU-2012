package edu.upeu.acweb.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import edu.upeu.acweb.dao.RolDao;
import edu.upeu.acweb.domain.Rol;

@Repository
public class RolDaoHibernateImpl implements RolDao {

	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public Rol getRolPorId(String idRol) {
		return (Rol) sessionFactory.getCurrentSession()
				.createCriteria(Rol.class)
				.add(Restrictions.idEq(idRol))
				.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Rol> getListaRoles() {
		return sessionFactory.getCurrentSession()
				.createCriteria(Rol.class)
				.list();
	}

}
