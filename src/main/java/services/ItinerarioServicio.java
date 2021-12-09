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
		//return DAOFactory.getItinerarioDAO().findByNombre(nombre);
		return null;
	}
}
