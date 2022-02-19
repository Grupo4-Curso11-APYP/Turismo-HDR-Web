package services;

import java.sql.SQLException;
import java.util.List;

import model.Atraccion;
import model.Promocion;
import model.PromocionPorcentual;
import model.TipoAtraccion;
import persistence.commons.DAOFactory;

public class PromocionServicio {

	/*
	 * Servicio usado por ListarPromocionServlet
	 */
	public List<Promocion> listar() throws Exception {
		return DAOFactory.getPromocionDAO().findAll();
	}

	public void delete(Integer id) throws SQLException {
		DAOFactory.getPromocionDAO().deleteLogico(id);
	}

	public Promocion buscar(Integer id) throws SQLException {
		return DAOFactory.getPromocionDAO().findOne(id);
	}

	public void actualizar(Promocion promo, String nombreNuevo) throws SQLException {
		DAOFactory.getPromocionDAO().update(promo, nombreNuevo);

	}
	
	public PromocionPorcentual crearPorcentual(String nombre, Atraccion[] packAtracciones,
			TipoAtraccion tipo, int descuento) throws Exception {
		
		PromocionPorcentual promoP = new PromocionPorcentual(nombre,
				packAtracciones, tipo, descuento);
		if (promoP.esValida(nombre, packAtracciones, tipo, descuento)) {
			DAOFactory.getPromocionDAO().insert(promoP);
		}
				
		return promoP;
		
	}

}
