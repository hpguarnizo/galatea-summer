package edu.wary.model.repository;

import java.util.List;

import javax.persistence.EntityManager;

import edu.wary.model.Almacen;

public class AlmacenRepository implements Entity<Almacen>{
	
	private EntityManager em;
	public AlmacenRepository(EntityManager em) {
		this.em = em;
	}

	@Override
	public Almacen insert(Almacen t) {
		// TODO Auto-generated method stub
		em.persist(t);
		return t;
	}

	@Override
	public void update(Almacen t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Almacen t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Almacen findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Almacen findById(int id) {
		// TODO Auto-generated method stub
		return em.find(Almacen.class, id);
	}

	@Override
	public Almacen findById(Almacen t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Almacen> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Almacen> listByCustomCriteria(Object... objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Almacen> listDesp() {
		// TODO Auto-generated method stub
		return null;
	}

}
