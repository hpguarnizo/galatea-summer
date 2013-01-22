package edu.wary.model.repository;

import java.util.List;

import javax.persistence.EntityManager;

import edu.wary.model.Usuario;

public class UsuarioRepository 
	implements Entity<Usuario>{
	
	private EntityManager em;
	
	public UsuarioRepository(EntityManager em) {
		this.em = em;
	}

	@Override
	public Usuario insert(Usuario t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Usuario t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Usuario t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario findById(String id) {
		// TODO Auto-generated method stub
		return em.find(Usuario.class,id);
	}

	@Override
	public Usuario findById(Usuario t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> listByCustomCriteria(Object... objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> listDesp() {
		// TODO Auto-generated method stub
		return null;
	}

}
