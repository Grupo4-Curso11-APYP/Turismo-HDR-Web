package services;

import java.sql.SQLException;
import java.util.List;

import model.Atraccion;
import model.TipoAtraccion;
import persistence.AtraccionDAO;
import persistence.commons.DAOFactory;
import persistence.impl.AtraccionDAOImpl;

public class AtraccionService {

	/*
	 * Servicio usado por ListAttractionsServlet
	 */
	public List<Atraccion> list() throws SQLException {
		//System.out.println(DAOFactory.getAtraccionDAO().findAll());
		return DAOFactory.getAtraccionDAO().findAll();
	}

	/*
	 * Servicio usado por CreateAttractionServlet
	 */
	public Atraccion crear(String name, Integer cost, Integer duration, Integer capacity, TipoAtraccion tipo) throws Exception {

		Atraccion atraccion = new Atraccion(name, cost, duration, capacity, tipo);

		if (atraccion.esValido(name, cost, duration, capacity,tipo.name())) {
			//AtraccionDAO atraccionDAO = DAOFactory.getAtraccionDAO();
			AtraccionDAOImpl atracDI = new AtraccionDAOImpl();
			String tipo_s = tipo.name();
			//public int insertarAtrac(String nombre, int costo, int tiempo, int cupoDisponible, String tipoAtraccion)
			atracDI.insertarAtrac(name, cost, duration, capacity, tipo_s);
			// XXX: si no devuelve "1", es que hubo mÃ¡s errores
		}

		return atraccion;
	}

	/*
	 * Servicio usado por EditAttractionServlet
	 */
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
	
	/*
	/*
	 * Servicio usado por EditAttractionServlet
	 *//*
	public Atraccion enumerar() throws SQLException {

		AtraccionDAO atraccionDAO = DAOFactory.getAtraccionDAO();
		//Atraccion atraccion = atraccionDAO.find(id);
		try {
			List<Atraccion> atracDI = AtraccionDAOImpl.findAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Atraccion atraccion = (Atraccion) AtraccionDAOImpl.findAll();

		//atraccion.setName(name);
		//atraccion.setCost(cost);
		//atraccion.setDuration(duration);
		//atraccion.setCapacity(capacity);

		/*if (atraccion.esValido()) {
			atraccionDAO.update(atraccion);
			// XXX: si no devuelve "1", es que hubo mÃ¡s errores
		}*/

		/*return atraccion;
	}*/

/*
 * Servicio usado por DeleteAttractionServlet
 */
	/*
	public void delete(Integer id) {
		Atraccion attraction = new Atraccion(id, null, null, null, null);

		AtraccionDAO attractionDAO = DAOFactory.getAtraccionDAO();
		attractionDAO.delete(attraction);
	}
*/
	public int find(String nombreAtrac) throws SQLException {
		
		
		//AtraccionDAO attractionDAO = DAOFactory.getAtraccionDAO();
		//return attractionDAO.buscarPorId(id_Atrac);
		
		AtraccionDAO atrac = new AtraccionDAOImpl();
		return atrac.find(nombreAtrac);
		//return (Atraccion) atrac;
	}

}
