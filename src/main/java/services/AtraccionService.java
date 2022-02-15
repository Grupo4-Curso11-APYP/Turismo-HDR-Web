package services;

import java.sql.SQLException;
import java.util.List;

import model.Atraccion;
import model.TipoAtraccion;
//import persistence.AtraccionDAO;
import persistence.commons.DAOFactory;
import persistence.impl.AtraccionDAOImpl;

public class AtraccionService {

	/*
	 * Servicio usado por ListAttractionsServlet
	 */
	public List<Atraccion> list() throws SQLException {
		return DAOFactory.getAtraccionDAO().findAll();
	}

	/*
	 * Servicio usado por CreateAttractionServlet
	 */

	public Atraccion crear(String name, Double cost, Double duration, Integer capacity, TipoAtraccion tipoDeAtraccion)
			throws Exception {

		Atraccion atraccion = new Atraccion(name, cost, duration, capacity, tipoDeAtraccion);

		if (atraccion.esValidoFull(name, cost, duration, capacity, tipoDeAtraccion)) {
			
			AtraccionDAOImpl atracDI = new AtraccionDAOImpl();
			atracDI.insertarAtrac(name, cost, duration, capacity, tipoDeAtraccion);
		}

		return atraccion;
	}

	/*
	 * Servicio usado por EditAttractionServlet
	 */

	public void update(Atraccion atraccion, int cupo) {
		DAOFactory.getAtraccionDAO().update(atraccion, cupo);
	}

	public void delete(Long id) throws SQLException {
		Atraccion atraccion = DAOFactory.getAtraccionDAO().buscarPorId(id);
		DAOFactory.getAtraccionDAO().deleteLogico(atraccion);
	}

	public Atraccion buscar(Long id) throws SQLException {
		return DAOFactory.getAtraccionDAO().buscarPorId(id);
	}

}
