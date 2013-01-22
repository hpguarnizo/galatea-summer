package edu.wary.model.repository;

import java.util.List;

import javax.persistence.EntityManager;

import edu.wary.model.Remitente;

public class RemitenteRepository 
	implements Entity<Remitente>{

	private EntityManager em;
	
	public RemitenteRepository(EntityManager em) {
		this.em = em;
	}

	@Override
	public Remitente insert(Remitente t) {
		// TODO Auto-generated method stub
		em.persist(t);
		return t;
	}

	@Override
	public void update(Remitente t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Remitente t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Remitente findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Remitente findById(Remitente t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Remitente> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Remitente> listByCustomCriteria(Object... objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Remitente findById(int id) {
		// TODO Auto-generated method stub
		return em.find(Remitente.class, id);
	}

	@Override
	public List<Remitente> listDesp() {
		// TODO Auto-generated method stub
		return null;
	}

}
