package persistence.commons;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import model.Usuario;

public interface GenericDAO<T> {

	/*
	 * Se encarga de contar todos los datos de una Tabla en especifico
	 */
	public int countAll() throws SQLException;
	
	public T find(Integer id); // prueba para ver si soluciona inconvenientes
	//public Set<Usuario> findAll();
	//public List<T> findAll();
	//public int countAll();
	public int insert(T t) throws SQLException;
	public int delete(T t) throws SQLException;
}
