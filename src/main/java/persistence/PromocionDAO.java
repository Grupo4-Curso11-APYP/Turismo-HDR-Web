package persistence;
import java.sql.SQLException;
import java.util.List;

import model.Promocion;
import persistence.commons.GenericDAO;

public interface PromocionDAO extends GenericDAO<Promocion> {
	public List<Promocion> findAll() throws SQLException;
	
	public int insert(Promocion promocion) throws SQLException;
	
	public int update(Promocion promocion) throws SQLException;

	public int deleteLogico(Promocion promocion)throws SQLException;

	public Promocion buscarPorId(Long id)throws SQLException;

	public int find(String nombre) throws SQLException;
	
	public Promocion consultarID_Promo(int promo) throws SQLException;

	public int update(Promocion promocion, String nombre) throws SQLException;

	public Promocion findByNombre(String nombre);
}
