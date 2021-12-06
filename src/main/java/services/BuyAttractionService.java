package services;

import java.util.HashMap;
import java.util.Map;

import model.Atraccion;
import model.Usuario;
import persistence.AtraccionDAO;
import persistence.UsuarioDAO;
import persistence.commons.DAOFactory;

public class BuyAttractionService {

	AtraccionDAO atraccionDAO = DAOFactory.getAtraccionDAO();
	UsuarioDAO usuarioDAO = DAOFactory.getUsuarioDAO();
/*
	public Map<String, String> buy(Integer userId, Integer attractionId) {
		Map<String, String> errors = new HashMap<String, String>();

		Usuario user = usuarioDAO.find(userId);
		Atraccion atraccion = atraccionDAO.find(attractionId);

		if (!atraccion.canHost(1)) {
			errors.put("atraccion", "No hay cupo disponible");
		}
		if (!user.canAfford(atraccion)) {
			errors.put("user", "No tienes dinero suficiente");
		}
		if (!user.canAttend(atraccion)) {
			errors.put("user", "No tienes tiempo suficiente");
		}

		if (errors.isEmpty()) {
			user.addToItinerary(atraccion);
			atraccion.host(1);

			// no grabamos para no afectar la base de pruebas
			atraccionDAO.update(atraccion);
			usuarioDAO.update(user);
		}

		return errors;

	}
	*/

}
