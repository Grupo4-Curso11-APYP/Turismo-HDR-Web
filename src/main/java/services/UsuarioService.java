package services;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import model.Promocion;
import model.TipoAtraccion;
import model.Usuario;

import persistence.commons.DAOFactory;

public class UsuarioService {

	public Set<Usuario> list() throws SQLException {
		return DAOFactory.getUsuarioDAO().findAll();
	}

	// public Usuario crear(int id, String nombre, double presupuesto, double
	// tiempoDisponible, TipoAtraccion tipoFavorito,String password, Boolean admin)
	// throws Exception {
	public Usuario crear(String nombre, Double presupuesto, Double tiempoDisponible, TipoAtraccion tipoFavorito,
			String password, Boolean admin) throws Exception {
	//public Usuario crear(int id, String nombre, double presupuesto, double tiempoDisponible, String tipoFavorito,
	//	String password, Boolean admin) throws Exception {
		// int id, String nombre, double presupuesto, double tiempoDisponible,
		// TipoAtraccion tipoFavorito,String password, Boolean admin
		// User user = new User(-1, username, password, coins, time, false);
		Usuario usuario = new Usuario(nombre, presupuesto, tiempoDisponible, tipoFavorito, password, admin);
	usuario.setPassword(password);
		// String nombre, String password, int presupuesto, Double
		// tiempoDisponible,TipoAtraccion tipoFavorito
		if (usuario.esUsuarioValido(nombre, password, presupuesto, tiempoDisponible, tipoFavorito)) {
		DAOFactory.getUsuarioDAO().insert(usuario);
			// XXX: si no devuelve "1", es que hubo mÃ¡s errores
		}

	return usuario;
	}

	public void delete(Long id) throws SQLException {
		Usuario usuario = DAOFactory.getUsuarioDAO().buscarPorId(id);
		DAOFactory.getUsuarioDAO().deleteLogico(usuario);
	}

}
