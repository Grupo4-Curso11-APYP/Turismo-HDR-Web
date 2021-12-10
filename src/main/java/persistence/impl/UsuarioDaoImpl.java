package persistence.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashSet;
import java.util.Set;

import model.TipoAtraccion;
import model.Usuario;
import persistence.commons.ConnectionProvider;
import persistence.commons.MissingDataException;
import persistence.UsuarioDAO;

public class UsuarioDaoImpl implements UsuarioDAO {

	/*
	 * Busca y devuelve todos los usuarios de la base de datos
	 */
	@Override
	public Set<Usuario> findAll() {
		try {
			String sql = "SELECT * FROM USUARIO";
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			ResultSet resultados = statement.executeQuery();

			Set<Usuario> usuarios = new LinkedHashSet<Usuario>();
			while (resultados.next()) {
				usuarios.add(toUser(resultados));
			}
			return usuarios;
		} catch (Exception e) {
			throw new MissingDataException(e);
		}
	}

	/*
	 * Cuenta todos los usuarios de la base de datos
	 */
	@Override
	public int countAll() throws SQLException {
		String sql = "SELECT COUNT(1) AS TOTAL FROM USUARIO";
		Connection conn = ConnectionProvider.getConnection();
		PreparedStatement statement = conn.prepareStatement(sql);
		ResultSet resultados = statement.executeQuery();

		resultados.next();
		int total = resultados.getInt("TOTAL");

		return total;
	}

	/*
	 * Inserta un usuario nuevo en la base de datos
	 */
	@Override
	public int insert(Usuario usuario) throws SQLException {
		try {
			String sql = "INSERT INTO USUARIO (NOMBRE, PRESUPUESTO,TIEMPODISPONIBLE,"
					+ "TIPOFAVORITO, PASSWORD) VALUES (?, ?, ?, ?, ?)";
			Connection conn = ConnectionProvider.getConnection();

			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, usuario.getNombre());
			statement.setDouble(2, usuario.getPresupuesto());
			statement.setDouble(3, usuario.getTiempoDisponible());
			statement.setObject(4, usuario.getTipoFavorito());
			statement.setString(5, usuario.getPassword());

			int rows = statement.executeUpdate();

			return rows;
		} catch (Exception e) {
			throw new MissingDataException(e);
		}
	}

	/*
	 * Actualiza el presupuesto y tiempoDisponible de un usuario en la base de datos
	 */
	@Override
	public int update(Usuario usuario) throws SQLException {
		String sql = "UPDATE USUARIO SET PRESUPUESTO = ?, TIEMPODISPONIBLE = ?  WHERE NOMBRE = ?";
		Connection conn = ConnectionProvider.getConnection();

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setDouble(1, usuario.getPresupuesto());
		statement.setDouble(2, usuario.getTiempoDisponible());
		statement.setString(3, usuario.getNombre());
		int rows = statement.executeUpdate();

		return rows;

	}

	/*
	 * Borra un usuario
	 */
	@Override
	public int delete(Usuario usuario) throws SQLException {
		String sql = "DELETE FROM USUARIO WHERE NOMBRE = ?";
		Connection conn = ConnectionProvider.getConnection();

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, usuario.getNombre());
		int rows = statement.executeUpdate();

		return rows;

	}

	/*
	 * Busca por nombre a un usuario en la base de datos y lo devuelve
	 */
	@Override
	public Usuario findByNombre(String nombre) {
		try {
			String sql = "SELECT * FROM USUARIO WHERE NOMBRE = ?";
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, nombre);
			ResultSet resultados = statement.executeQuery();

			Usuario usuario = null;

			if (resultados.next()) {
				usuario = toUser(resultados);
			}
			return usuario;
		} catch (Exception e) {
			throw new MissingDataException(e);
		}
	}

	/*
	 * Instancia un Usuario a partir de la base de datos
	 */
	private Usuario toUser(ResultSet resultados) throws Exception {
		String nombre = resultados.getString(2);
		Double presupuesto = resultados.getDouble(3);
		Double tiempoDisponible = resultados.getDouble(4);
		String tipoFavorito = resultados.getString(5);
		//TipoAtraccion tipoFavorito = TipoAtraccion.valueOf(resultados.getString(5));<<====================== esto lo cambio para que no rompa al hacer el insert
		String password = resultados.getString(6);
		Boolean admin = resultados.getBoolean(7);
		//return new Usuario(nombre, presupuesto, tiempoDisponible, tipoFavorito, password, admin);
		return new Usuario(0, nombre, presupuesto, tiempoDisponible, tipoFavorito, password, admin);
	}

	@Override
	public Usuario find(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
