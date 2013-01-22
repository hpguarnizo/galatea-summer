package edu.wary.model.repository;

import java.util.List;

import edu.wary.model.Remitente;

public interface Entity<T> {
	public T insert(T t);
	
	public void update(T t);
	
	public void delete(T t);

	public T findById(String id);
	
	public T findById(int id);
	
	public T findById(T t);
	
	public List<T> listAll();
	
	public List<T> listDesp();
	
	public List<T> listByCustomCriteria(Object...objects);
}
