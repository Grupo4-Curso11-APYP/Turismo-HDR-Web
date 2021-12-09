package services;

import java.util.Set;

import model.Ofertable;
import persistence.commons.DAOFactory;
import persistence.ItinerarioDAO;
import persistence.impl.ItinerarioDAOImpl;

public class ItinerarioServicio {
	/*
	 * Servicio usado por ListarPromocionServlet
	 */
	public Set<Ofertable> listar(String nombre) throws Exception {
		return ((ItinerarioDAOImpl) DAOFactory.getItinerarioDAO()).findByNombre(nombre);
	}
}
