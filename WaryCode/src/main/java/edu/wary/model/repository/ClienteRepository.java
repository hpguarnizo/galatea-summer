package edu.wary.model.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import edu.wary.model.Cliente;


public class ClienteRepository 
	implements Entity<Cliente>{
	
	private EntityManager em;	
	
	public ClienteRepository(EntityManager em) {
		this.em = em;
	}

	@Override
	public Cliente insert(Cliente t) {
		// TODO Auto-generated method stub
		em.persist(t);
		return t;
	}

	@Override
	public void update(Cliente t) {
		// TODO Auto-generated method stub
		em.merge(t);
	}

	@Override
	public void delete(Cliente t) {
		// TODO Auto-generated method stub
		Cliente cliente=em.find(Cliente.class, t.getIdCod());
		em.remove(cliente);
	}

	@Override
	public Cliente findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente findById(Cliente t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> listAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Cliente> listByCustomCriteria(Object... objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente findById(int id) {
		// TODO Auto-generated method stub
		return em.find(Cliente.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> listDesp() {
		// TODO Auto-generated method stub
		Query query=em.createQuery("Select o From Cliente o");
		List<Cliente> busqueda=query.getResultList();
		return busqueda;
	}

}
