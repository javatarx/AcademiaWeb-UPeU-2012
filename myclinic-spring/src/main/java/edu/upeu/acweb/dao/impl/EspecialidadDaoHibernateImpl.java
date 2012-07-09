package edu.upeu.acweb.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import edu.upeu.acweb.dao.EspecialidadDao;
import edu.upeu.acweb.domain.Especialidad;

@Repository
public class EspecialidadDaoHibernateImpl implements EspecialidadDao {

	@Resource
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Especialidad> getListaEspecialidades() {
		return sessionFactory.getCurrentSession()
				.createCriteria(Especialidad.class)
				.list();
	}

}
