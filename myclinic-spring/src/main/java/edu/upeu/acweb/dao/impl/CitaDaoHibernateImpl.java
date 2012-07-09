package edu.upeu.acweb.dao.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import edu.upeu.acweb.dao.CitaDao;
import edu.upeu.acweb.domain.Cita;

@Repository
public class CitaDaoHibernateImpl implements CitaDao{

	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public void guardarCita(Cita cita) {
		sessionFactory.getCurrentSession().save(cita);	
	}

	@Override
	public void eliminarCita(Cita cita) {
		sessionFactory.getCurrentSession().delete(cita);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cita> getListaCitas() {
		return sessionFactory.getCurrentSession()
				.createCriteria(Cita.class)
				.addOrder(Order.asc("fechaCita"))
				.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cita> getListaCitasPorUsuario(String idUsuario) {
		return sessionFactory.getCurrentSession()
				.createCriteria(Cita.class)
				.createAlias("usuario", "u")
				.add(Restrictions.eq("u.id", idUsuario))
				.addOrder(Order.asc("fechaCita"))
				.list();
	}

	@Override
	public List<Cita> getListaCitasPorUsuarioFecha(String idUsuario, Date fecha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cita> getListaCitasPorMedico(String idMedico) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cita> getListaCitasPorEspecialidad(String idEspecialidad) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
