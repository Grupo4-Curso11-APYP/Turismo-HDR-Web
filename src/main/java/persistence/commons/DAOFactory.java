package persistence.commons;

import persistence.AtraccionDAO;
import persistence.UsuarioDAO;
import persistence.impl.AtraccionDAOImpl;
import persistence.impl.UsuarioDaoImpl;

public class DAOFactory {

	public static UsuarioDAO getUsuarioDAO() {
		return new UsuarioDaoImpl();
	}
	
	public static AtraccionDAO getAtraccionDAO() {
		return new AtraccionDAOImpl();
	}
}
