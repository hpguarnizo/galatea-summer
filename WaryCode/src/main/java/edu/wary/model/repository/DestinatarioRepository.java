package edu.wary.model.repository;

import java.util.List;

import javax.persistence.EntityManager;

import edu.wary.model.Destinatario;

public class DestinatarioRepository 
	implements Entity<Destinatario>{

	private EntityManager em;
	
	public DestinatarioRepository(EntityManager em) {
		this.em = em;
	}

	@Override
	public Destinatario insert(Destinatario t) {
		// TODO Auto-generated method stub
		em.persist(t);
		return t;
	}

	@Override
	public void update(Destinatario t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Destinatario t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Destinatario findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Destinatario findById(Destinatario t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Destinatario> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Destinatario> listByCustomCriteria(Object... objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Destinatario findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Destinatario> listDesp() {
		// TODO Auto-generated method stub
		return null;
	}

}
