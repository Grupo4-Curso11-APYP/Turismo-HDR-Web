package services;

import java.util.Set;

import model.Ofertable;
import model.Promocion;
import persistence.commons.DAOFactory;

public class ItinerarioServicio {
	/*
	 * Servicio usado por ListarPromocionServlet
	 */
	public Set<Ofertable> listar() throws Exception {
		//return DAOFactory.getItinerarioDAO().findAll();
		return null;
	}
}
