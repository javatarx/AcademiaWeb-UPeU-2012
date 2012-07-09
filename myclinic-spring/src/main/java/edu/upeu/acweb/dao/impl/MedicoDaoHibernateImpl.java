package edu.upeu.acweb.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import edu.upeu.acweb.dao.MedicoDao;
import edu.upeu.acweb.domain.Medico;

@Repository
public class MedicoDaoHibernateImpl implements MedicoDao {
	
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Medico> getListaMedicos() {
		return sessionFactory.getCurrentSession()
				.createCriteria(Medico.class)
				.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Medico> getListaMedicosPorEspecialidad(String idEspecialidad) {
		return sessionFactory.getCurrentSession()
				.createCriteria(Medico.class)
				.createAlias("especialidad", "e")
				.add(Restrictions.eq("e.id", idEspecialidad))
				.list();
	}

}
