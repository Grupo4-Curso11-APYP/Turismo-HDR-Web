package persistence.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import model.Atraccion;
import model.Itinerario;
import model.Ofertable;
import model.Promocion;
import model.Usuario;
import persistence.commons.ConnectionProvider;
import persistence.ItinerarioDAO;
import persistence.commons.MissingDataException;

public class ItinerarioDAOImpl implements ItinerarioDAO {

	private AtraccionDAOImpl atraccionDao;
	private PromocionDAOImpl promocionDao;
	private UsuarioDaoImpl usuarioDao;
	
	/*
	 * Busca un itinerario por nombre de usuario
	 */
	@Override
	public Set<Ofertable> findByNombre(String nombre) {
		try {
			String sql = "SELECT Itinerario.ID_Promocion, Itinerario.ID_Atraccion\r\n" + "FROM Itinerario\r\n"
					+ "INNER JOIN Usuario \r\n" + "ON usuario.ID_Usuario = Itinerario.ID_Usuario\r\n"
					+ "WHERE Usuario.Nombre = ?";
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, nombre);
			ResultSet resultados = statement.executeQuery();

			Set<Ofertable> itinerario = new LinkedHashSet<Ofertable>();
			atraccionDao = new AtraccionDAOImpl();
			promocionDao = new PromocionDAOImpl();
			esPromoOesAtraccion(resultados, itinerario);
			return itinerario;
		} catch (Exception e) {
			throw new MissingDataException(e);
		}
	}
	
	@Override
	public List<Itinerario> findAll() throws SQLException {
		String sql = "SELECT * FROM Itinerario ORDER BY ID_Usuario";
		Connection conn = ConnectionProvider.getConnection();
		PreparedStatement statement = conn.prepareStatement(sql);
		ResultSet resultados = statement.executeQuery();
		
		List<Itinerario> itinerarios = new LinkedList<Itinerario>();
		while (resultados.next()) {
			try { itinerarios.add(aItinerario(resultados));
			} catch (Exception e) {

				throw new MissingDataException(e);
			}
		} return itinerarios;
	}

	private Itinerario aItinerario(ResultSet resultados) throws SQLException {
		int idPromocion = resultados.getInt(1);
		Long id = resultados.getLong(2);
		usuarioDao = new UsuarioDaoImpl();
		atraccionDao = new AtraccionDAOImpl();
		promocionDao = new PromocionDAOImpl();
		Usuario usuario = this.usuarioDao.buscarPorId(resultados.getLong(3));
		Long idAtraccion = resultados.getLong(4);
		Ofertable ofertable;
		if (idPromocion > 0) {
			ofertable = this.promocionDao.consultarID_Promo(idPromocion);
		} else {
			ofertable = this.atraccionDao.buscarPorId(idAtraccion);
		}
		Itinerario itinerario = new Itinerario(id, usuario, ofertable);
		return itinerario;
	}

	/*
	 * mï¿½todo usado por findByNombre para determinar si el ofertable de un
	 * itinerario es una promociï¿½n o atracciï¿½n.
	 */
	private void esPromoOesAtraccion(ResultSet resultados, Set<Ofertable> itinerario) throws SQLException {
		while (resultados.next()) {
			int idPromocion = resultados.getInt(1);
			Long idAtraccion = resultados.getLong(2);
			if (idPromocion > 0) {
				itinerario.add(promocionDao.consultarID_Promo(idPromocion));
			} else {
				itinerario.add(atraccionDao.buscarPorId(idAtraccion));
			}
		}
	}

	/*
	 * inserta un itinerario en la base de datos.
	 */
	@Override
	public int insertar(String nombreUsuario, String nombreOfertable) {
		try {
			String sql = "INSERT INTO Itinerario (ID_Atraccion, ID_Usuario, ID_Promocion) VALUES ((SELECT ID_Atraccion FROM Atraccion WHERE Nombre = ?)\r\n"
					+ ",(SELECT ID_Usuario FROM Usuario WHERE Nombre = ?),(SELECT ID_Promocion FROM Promocion WHERE Nombre = ?))";
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, nombreOfertable);
			statement.setString(2, nombreUsuario);
			statement.setString(3, nombreOfertable);
			int rows = statement.executeUpdate();

			return rows;
		} catch (Exception e) {
			throw new MissingDataException(e);
		}
	}

	/*
	 * Actualiza un itinerario en la base de datos
	 */
	@Override
	public int update(int idAtraccion, int idPromocion, int idUsuario, int idItinerario) {
		try {
			String sql = "UPDATE Itinerario SET ID_Atraccion = ?, ID_Promocion = ?, ID_Usuario = ? \r\n"
					+ "WHERE ID_Itinerario = ?";
			Connection conn = ConnectionProvider.getConnection();

			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, idAtraccion);
			statement.setInt(2, idPromocion);
			statement.setInt(3, idUsuario);
			statement.setInt(4, idItinerario);
			int rows = statement.executeUpdate();

			return rows;
		} catch (Exception e) {
			throw new MissingDataException(e);
		}
	}

	@Override
	public Usuario find(Integer id) {
		return null;
	}

	@Override
	public int insert(Usuario t) {
		return 0;
	}

}
