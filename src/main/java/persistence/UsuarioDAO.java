package persistence;

import java.sql.SQLException;
import java.util.List;
import model.Usuario;
import persistence.commons.GenericDAO;

public interface UsuarioDAO extends GenericDAO<Usuario> {
	
	public abstract Usuario findByNombre(String nombre) throws SQLException;
	
	public int insert(Usuario usuario) throws SQLException;
	
	public int update(Usuario usuario) throws SQLException;

	public abstract Usuario buscarPorId(Long id)throws SQLException;

	public abstract int deleteLogico(Integer id)throws SQLException;
	
}
