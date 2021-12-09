package persistence;

import java.sql.SQLException;
import java.util.Set;

import persistence.commons.GenericDAO;
import model.Ofertable;
import model.Usuario;


public interface ItinerarioDAO extends GenericDAO<Usuario>{

	public int delete(int idItinerario) throws SQLException;
	
	public int update(int idAtraccion, int idPromocion, int idUsuario, int idItinerario);
	
	public Set<Ofertable> findByNombre(String nombre);
	
	public int insertar(String nombreUsuario, String nombreOfertable);
}
