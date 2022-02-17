package persistence.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import persistence.commons.ConnectionProvider;

import persistence.commons.MissingDataException;
import persistence.AtraccionDAO;
import model.Atraccion;
import model.TipoAtraccion;

public class AtraccionDAOImpl implements AtraccionDAO {

	public Atraccion findByNombre(String nombre) {
		try {
			String sql = "SELECT * FROM Atraccion INNER JOIN TipoAtraccion ON Atraccion.TipoDeAtraccion = TipoAtraccion.id_tipoAtraccion WHERE Nombre = ?";
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, nombre);
			ResultSet resultados = statement.executeQuery();

			Atraccion atraccion = null;

			if (resultados.next()) {
				atraccion = toAtraccion(resultados);
			}

			return atraccion;
		} catch (Exception e) {
			throw new MissingDataException(e);
		}
	}

	/*
	 * Busca y devuelve todas las atracciones de la base de datos
	 */
	@Override
	public List<Atraccion> findAll() throws SQLException {
		try {
			String sql = "SELECT Atraccion.ID_Atraccion, Atraccion.Nombre, Atraccion.Costo, Atraccion.Tiempo, Atraccion.Cupo_Disponible, TipoAtraccion.id_tipoAtraccion\r\n"
					+ "FROM Atraccion INNER JOIN TipoAtraccion\r\n"
					+ "ON Atraccion.TipoDeAtraccion = TipoAtraccion.id_tipoAtraccion\r\n"
					+ "WHERE Atraccion.Estado <> 0";

			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			ResultSet resultados = statement.executeQuery();

			ArrayList<Atraccion> atracciones = new ArrayList<Atraccion>();
			while (resultados.next()) {
				atracciones.add(toAtraccion(resultados));
			}

			return atracciones;
		} catch (Exception e) {
			throw new MissingDataException(e);
		}
	}

	/*
	 * Instancia un objeto atraccion a partir de la base de datos
	 */
	public Atraccion toAtraccion(ResultSet resultados) throws Exception {

		Integer id = resultados.getInt(1);
		String nombre = resultados.getString(2);
		double costo = resultados.getDouble(3);
		double tiempo = resultados.getDouble(4);
		int cupoDisponible = resultados.getInt(5);
		TipoAtraccion tipo = TipoAtraccion.valueOf(resultados.getString(6).toUpperCase());

		return new Atraccion(id, nombre, costo, tiempo, cupoDisponible, tipo);

	}	

	/*
	 * Actualiza una atraccion en la base de datos
	 */
	@Override
	public int update(Atraccion atraccion, int cupo) {
		try {
			String sql = "UPDATE Atraccion SET Cupo_Disponible = ? WHERE Nombre = ?";
			Connection conn = ConnectionProvider.getConnection();

			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, cupo);
			statement.setString(2, atraccion.getNombre());

			int rows = statement.executeUpdate();

			return rows;
		} catch (Exception e) {
			throw new MissingDataException(e);
		}
	}

	/*
	 * Update de la compra que settea segun atributo de atraccion
	 */
	@Override
	public int update(Atraccion atraccion) throws SQLException {
		try {
			String sql = "UPDATE Atraccion SET Cupo_Disponible = ? WHERE Nombre = ?";
			Connection conn = ConnectionProvider.getConnection();

			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, atraccion.getCupoDisponible());
			statement.setString(2, atraccion.getNombre());

			int rows = statement.executeUpdate();

			return rows;
		} catch (Exception e) {
			throw new MissingDataException(e);
		}
	}

	/*
	 * Busca una atracciï¿½n por su ID en la base de datos
	 */
	@Override
	public Atraccion buscarPorId(Long IdAtraccion) {
		try {
			String sql = "SELECT Atraccion.ID_Atraccion, Atraccion.Nombre,Atraccion.Costo ,"
					+ " Atraccion.Tiempo, Atraccion.Cupo_Disponible," + "  Atraccion.TipoDeAtraccion"
					+ " FROM Atraccion" + " WHERE Atraccion.Id_Atraccion = ?";
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setLong(1, IdAtraccion);
			ResultSet resultados = statement.executeQuery();

			Atraccion atraccion = null;

			if (resultados.next()) {
				atraccion = toAtraccion(resultados);
			}

			return atraccion;
		} catch (Exception e) {
			throw new MissingDataException(e);
		}
	}

	@Override
	public int insert(Atraccion atraccion) throws SQLException {
		String sql = "INSERT INTO ATRACCION (NOMBRE, COSTO, TIEMPO, CUPO_DISPONIBLE, TIPODEATRACCION) VALUES (?,?,?,?,?)";

		Connection conn = ConnectionProvider.getConnection();
		PreparedStatement statement = conn.prepareStatement(sql);

		statement.setString(1, atraccion.getNombre());
		statement.setDouble(2, atraccion.getCosto());
		statement.setDouble(3, atraccion.getTiempo());
		statement.setInt(4, atraccion.getCupoDisponible());
		statement.setObject(5, atraccion.getTipoAtraccion());

		int rows = statement.executeUpdate();

		return rows;
	}

	/*
	 * Actualiza estado de atraccion en la base de datos para borrado lógico
	 */
	@Override
	public int deleteLogico(Integer id) throws SQLException {
		try {
			String sql = "UPDATE Atraccion SET Estado = ? WHERE ID_Atraccion = ?";
			Connection conn = ConnectionProvider.getConnection();

			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, 0);
			statement.setInt(2, id);

			int rows = statement.executeUpdate();

			return rows;
		} catch (Exception e) {
			throw new MissingDataException(e);
		}
	}

}
