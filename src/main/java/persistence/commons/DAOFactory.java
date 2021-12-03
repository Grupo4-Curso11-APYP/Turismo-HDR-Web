package persistence.commons;

import persistence.AtraccionDAO;
import persistence.UsuarioDAO;
import persistence.impl.AtraccionDAOImpl;
import persistence.impl.UsuarioDaoImpl;

public class DAOFactory {

	public static UsuarioDAO getUserDAO() {
		return new UsuarioDaoImpl();
	}
	
	public static AtraccionDAO getAttractionDAO() {
		return new AtraccionDAOImpl();
	}
}
