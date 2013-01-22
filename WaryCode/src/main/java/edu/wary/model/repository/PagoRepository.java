package edu.wary.model.repository;

import java.util.List;

import javax.persistence.EntityManager;

import edu.wary.model.Pago;

public class PagoRepository 
	implements Entity<Pago>{

	private EntityManager em;
	
	public PagoRepository(EntityManager em){
		this.em=em;
	}
	
	@Override
	public Pago insert(Pago t) {
		// TODO Auto-generated method stub
		em.persist(t);
		return t;
	}

	@Override
	public void update(Pago t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Pago t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pago findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pago findById(Pago t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pago> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pago> listByCustomCriteria(Object... objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pago findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pago> listDesp() {
		// TODO Auto-generated method stub
		return null;
	}

}
