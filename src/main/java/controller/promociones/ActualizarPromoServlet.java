package controller.promociones;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Promocion;
import model.PromocionAbsoluta;
import persistence.commons.MissingDataException;
import services.PromocionServicio;

@WebServlet("/actualizar-promo-form.do")
public class ActualizarPromoServlet extends HttpServlet implements Servlet {

	private static final long serialVersionUID = 2270133873221818569L;
	private PromocionServicio promoService;
	
	@Override
	public void init() throws ServletException {
		super.init();
		this.promoService = new PromocionServicio();
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nombreNuevo = req.getParameter("nombre");
		Promocion promo = (Promocion) req.getSession().getAttribute("promoAEditar");
		
		try {
			promoService.actualizar(promo, nombreNuevo);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		resp.sendRedirect("/turismoHDR/listar-promo.do");
		
	}
}
