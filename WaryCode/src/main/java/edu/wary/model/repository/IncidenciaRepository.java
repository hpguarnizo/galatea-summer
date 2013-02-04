package edu.wary.model.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import edu.wary.model.Incidencia;

public class IncidenciaRepository 
	implements Entity<Incidencia>{
	
	private EntityManager em;	
	
	public IncidenciaRepository(EntityManager em) {
		this.em = em;
	}

	@Override
	public Incidencia insert(Incidencia t) {
		//	 TODO Auto-generated method stub
		em.persist(t);
		return t;
	}

	@Override
	public void update(Incidencia t) {
		// TODO Auto-generated method stub
		em.merge(t);
	}

	@Override
	public void delete(Incidencia t) {
		// TODO Auto-generated method stub
		Incidencia Incidencia=em.find(Incidencia.class, t.getIdEnco());
		em.remove(Incidencia);
	}

	@Override
	public Incidencia findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Incidencia findById(Incidencia t) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Incidencia> listAll() {
		// TODO Auto-generated method stub
		Query query=em.createQuery("Select o From Incidencia o");
		List<Incidencia> Incidencias=query.getResultList();
		return Incidencias;
	}

	@Override
	public List<Incidencia> listByCustomCriteria(Object... objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Incidencia findById(int id) {
		// TODO Auto-generated method stub
		return em.find(Incidencia.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Incidencia> listDesp() {
		// TODO Auto-generated method stub
		Query query=em.createQuery("Select o From Incidencia o");
		List<Incidencia> despachos=query.getResultList();
		return despachos;
	}

}
