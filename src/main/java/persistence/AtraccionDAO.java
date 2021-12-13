package persistence;

import java.sql.SQLException;
import java.util.List;

import model.Atraccion;
import persistence.commons.GenericDAO;


public interface AtraccionDAO extends GenericDAO<Atraccion> {
	
		public abstract Atraccion buscarPorId(Long id) throws SQLException;
		
		public int insertarAtrac(String nombre, int costo, int tiempo, int cupoDisponible, String tipoAtraccion) throws SQLException;
		
		public List<Atraccion> findAll();
		
		public int delete(Atraccion atraccion) throws SQLException;
		
		public int find(String nombre) throws SQLException;

		public int update(Atraccion atraccion, int cupo);

		public abstract int deleteLogico(Atraccion atraccion) throws SQLException;

		public int update(Atraccion atraccion) throws SQLException;
		
		public Atraccion findByNombre(String nombre);
	}
