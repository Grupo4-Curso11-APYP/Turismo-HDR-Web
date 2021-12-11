package persistence;

import java.sql.SQLException;
import java.util.Set;

import model.Usuario;
import persistence.commons.GenericDAO;

public interface UsuarioDAO extends GenericDAO<Usuario> {
	public abstract Usuario findByNombre(String nombre) throws SQLException;
	
	public Set<Usuario> findAll();
	//public Set<Usuario> findAll() throws SQLException;
	
	public int insert(Usuario usuario) throws SQLException;
	
	public int delete(Usuario usuario) throws SQLException;
	
	public int update(Usuario usuario) throws SQLException;
	/*
	 * public int insert(Usuario usuario) throws SQLException;
	
	public int delete(Usuario usuario) throws SQLException;
	
	public int update(Usuario usuario) throws SQLException;
	 */

	public abstract Usuario buscarPorId(Long id)throws SQLException;

	public abstract int deleteLogico(Usuario usuario)throws SQLException;

	public int find(String nombre) throws SQLException;
}
