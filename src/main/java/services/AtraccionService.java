package services;

import java.sql.SQLException;
import java.util.List;

import model.Atraccion;
import model.TipoAtraccion;
import persistence.AtraccionDAO;
import persistence.commons.DAOFactory;
import persistence.impl.AtraccionDAOImpl;

public class AtraccionService {

	public List<Atraccion> list() throws Exception {
		return DAOFactory.getAtraccionDAO().findAll();
	}

	/*public Atraccion create(String name, Integer cost, Double duration, Integer capacity, TipoAtraccion tipo) {

		Atraccion atraccion = new Atraccion(name, cost, duration, capacity,tipo);

		if (atraccion.esValido(name, cost, duration, capacity,tipo)) {
			AtraccionDAO atraccionDAO = DAOFactory.getAtraccionDAO();
			atraccionDAO.insertarAtrac(name, cost, duration, capacity,tipo);
			// XXX: si no devuelve "1", es que hubo mÃ¡s errores
		}

		return atraccion;
	}*/

	/*public Atraccion update(Integer id, String name, Integer cost, Double duration, Integer capacity) {

		AtraccionDAO atraccionDAO = DAOFactory.getAtraccionDAO();
		Atraccion atraccion = atraccionDAO.find(id);

		atraccion.setName(name);
		atraccion.setCost(cost);
		atraccion.setDuration(duration);
		atraccion.setCapacity(capacity);

		if (atraccion.isValid()) {
			atraccionDAO.update(atraccion);
			// XXX: si no devuelve "1", es que hubo mÃ¡s errores
		}

		return atraccion;
	}

	public void delete(Integer id) {
		Atraccion attraction = new Atraccion(id, null, null, null, null);

		AtraccionDAO attractionDAO = DAOFactory.getAtraccionDAO();
		attractionDAO.delete(attraction);
	}

	public Atraccion find(Integer id) {
		AtraccionDAO attractionDAO = DAOFactory.getAtraccionDAO();
		return attractionDAO.find(id);
	}*/

}
