package persistence;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import persistence.commons.GenericDAO;
import model.Itinerario;
import model.Ofertable;
import model.Usuario;


public interface ItinerarioDAO extends GenericDAO<Usuario>{
	
	public int update(int idAtraccion, int idPromocion, int idUsuario, int idItinerario);
	
	public Set<Ofertable> findByNombre(String nombre);
	
	public int insertar(String nombreUsuario, String nombreOfertable);

	public List<Itinerario> findAll() throws SQLException;
}
