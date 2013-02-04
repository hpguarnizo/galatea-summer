package edu.wary.model.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import edu.wary.model.Encomienda;

public class EncomiendaRepository implements Entity<Encomienda>{
	
	private EntityManager em;	
	
	public EncomiendaRepository(EntityManager em) {
		this.em = em;
	}

	@Override
	public Encomienda insert(Encomienda t) {
		// TODO Auto-generated method stub
		em.persist(t);
		return t;
	}

	@Override
	public void update(Encomienda t) {
		// TODO Auto-generated method stub
		em.merge(t);
	}

	@Override
	public void delete(Encomienda t) {
		// TODO Auto-generated method stub
		Encomienda encomienda=em.find(Encomienda.class, t.getIdEnco());
		em.remove(encomienda);
	}

	@Override
	public Encomienda findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Encomienda findById(Encomienda t) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Encomienda> listAll() {
		// TODO Auto-generated method stub
		Query query=em.createQuery("Select o From Encomienda o Where o.estado='en despacho'");
		List<Encomienda> encomiendas=query.getResultList();
		return encomiendas;
	}

	@Override
	public List<Encomienda> listByCustomCriteria(Object... objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Encomienda findById(int id) {
		// TODO Auto-generated method stub
		return em.find(Encomienda.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Encomienda> listDesp() {
		// TODO Auto-generated method stub
		Query query=em.createQuery("Select o From Encomienda o");
		List<Encomienda> despachos=query.getResultList();
		return despachos;
	}

}
