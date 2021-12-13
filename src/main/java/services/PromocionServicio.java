package services;

import java.sql.SQLException;
import java.util.List;

import model.Promocion;
import persistence.commons.DAOFactory;

public class PromocionServicio {

	/*
	 * Servicio usado por ListarPromocionServlet
	 */
	public List<Promocion> listar() throws Exception {
		return DAOFactory.getPromocionDAO().findAll();
	}

	public void delete(Long id) throws SQLException {
		Promocion promocion = DAOFactory.getPromocionDAO().buscarPorId(id);
		DAOFactory.getPromocionDAO().deleteLogico(promocion);
	}
public Promocion buscar(Integer id) throws SQLException {
		return DAOFactory.getPromocionDAO().consultarID_Promo(id);
	}

	public void actualizar(Promocion promo, String nombreNuevo) throws SQLException {
		DAOFactory.getPromocionDAO().update(promo, nombreNuevo);
		
	}

}
