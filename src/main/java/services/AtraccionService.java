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
	
	
	public Atraccion crear(String name, Double cost, Double duration, Integer capacity, TipoAtraccion tipoDeAtraccion) throws Exception {
		//public Atraccion crear(String name, Integer cost, Integer duration, Integer capacity, TipoAtraccion tipo) throws Exception {

		Atraccion atraccion = new Atraccion(name, cost, duration, capacity, tipoDeAtraccion);

		if (atraccion.esValido(name, cost, duration, capacity,tipoDeAtraccion)) {
			//AtraccionDAO atraccionDAO = DAOFactory.getAtraccionDAO();
			AtraccionDAOImpl atracDI = new AtraccionDAOImpl();
			//String tipo_s = tipo.name();
			//public int insertarAtrac(String nombre, int costo, int tiempo, int cupoDisponible, String tipoAtraccion)
			atracDI.insertarAtrac(name, cost, duration, capacity, tipoDeAtraccion);
			// XXX: si no devuelve "1", es que hubo mÃ¡s errores
		}

		return atraccion;
	}
	

	/*
	 * Servicio usado por EditAttractionServlet
	 */
	public Atraccion update(Integer id, String name, Double cost, Double duration, Integer capacity,TipoAtraccion tipoDeAtraccion) {
		

		AtraccionDAO atraccionDAO = DAOFactory.getAtraccionDAO();
		Atraccion atraccion = atraccionDAO.find(id);

		atraccion.setNombre(name);
		atraccion.setCosto(cost);
		atraccion.setTiempo(duration);
		atraccion.setCupoDisponible(capacity);
		atraccion.setTipoAtraccion(tipoDeAtraccion);

		if (atraccion.esValido(name, cost, duration, capacity,tipoDeAtraccion)) {
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
	public void delete(Integer id) throws SQLException {
		Atraccion atraccion = new Atraccion(id);

		AtraccionDAO attractionDAO = DAOFactory.getAtraccionDAO();
		attractionDAO.delete(atraccion);
	}
	*/
	
	public void delete(Long id) throws SQLException {
		Atraccion atraccion = DAOFactory.getAtraccionDAO().buscarPorId(id);
		DAOFactory.getAtraccionDAO().delete(atraccion);
	}

	/*public int find(int nombreAtrac) throws SQLException {
		//public int find(String nombreAtrac) throws SQLException {<====== asi estaba antes de esta modificacion
	//public String find(String nombreAtrac) throws SQLException {
		
		
		AtraccionDAO attractionDAO = DAOFactory.getAtraccionDAO();
		return attractionDAO.buscarPorId(id_Atrac);
		
		//AtraccionDAO atrac = new AtraccionDAOImpl();<====== asi estaba antes de esta modificacion
		//return atrac.find(nombreAtrac);<====== asi estaba antes de esta modificacion
		
		//return (Atraccion) atrac;
	}*/
	
	public Atraccion find(Integer id) {
		return DAOFactory.getAtraccionDAO().find(id);
	}

}
