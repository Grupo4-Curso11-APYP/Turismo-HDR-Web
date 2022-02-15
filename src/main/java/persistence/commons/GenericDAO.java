package persistence.commons;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import model.Usuario;

public interface GenericDAO<T> {

	/*
	 * Se encarga de contar todos los datos de una Tabla en especifico
	 */	
	public T find(Integer id);
	public int insert(T t) throws SQLException;
}
