package persistence.commons;

import java.sql.SQLException;
import java.util.List;

public interface GenericDAO<T> {

	/*
	 * Se encarga de contar todos los datos de una Tabla en especifico
	 */
	public int countAll() throws SQLException;
	
	public T find(Integer id); // prueba para ver si soluciona inconvenientes
	public List<T> findAll();
	//public int countAll();
	public int insert(T t);
	public int update(T t);
	public int delete(T t);
}
