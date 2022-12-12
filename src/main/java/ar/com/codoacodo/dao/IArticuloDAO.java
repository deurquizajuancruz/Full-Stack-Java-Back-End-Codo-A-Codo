package ar.com.codoacodo.dao;

import java.util.List;

import ar.com.codoacodo.domain.Articulo;

public interface IArticuloDAO {
	
	public Articulo getById(Long id) throws Exception;
	
	public List<Articulo> findAll() throws Exception;
	
	public void create (Articulo articulo) throws Exception;
	
	public void delete(Long id) throws Exception;
	
	public void update(Articulo articulo) throws Exception;
}
