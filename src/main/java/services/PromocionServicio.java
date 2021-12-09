package services;

import java.util.List;

import model.Promocion;
import persistence.commons.DAOFactory;

public class PromocionServicio {

	/*
	 * Servicio usado por ListarPromocionServlet
	 */
	public List<Promocion> listar() throws Exception {
		return DAOFactory.getPromocionDAO().findAll();
	}

}
