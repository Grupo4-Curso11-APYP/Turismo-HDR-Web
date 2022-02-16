package persistence;

import java.sql.SQLException;
import java.util.List;

import model.Atraccion;
import model.TipoAtraccion;
import persistence.commons.GenericDAO;


public interface AtraccionDAO extends GenericDAO<Atraccion> {
	
		public abstract Atraccion buscarPorId(Long id) throws SQLException;

		public int update(Atraccion atraccion, int cupo);

		public abstract int deleteLogico(Integer id) throws SQLException;

		public int update(Atraccion atraccion) throws SQLException;
		
		public Atraccion findByNombre(String nombre);

	}
