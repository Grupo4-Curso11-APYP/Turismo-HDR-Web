package controller.promociones;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import persistence.commons.MissingDataException;
import services.PromocionServicio;


/**
 * Servlet implementation class DeletePromocionServlet
 */
@WebServlet("/borrar-promo.do")
public class DeletePromocionServlet extends HttpServlet {
	
     
	private static final long serialVersionUID = 4566858982097940928L;
	private PromocionServicio promocionServicio;

	@Override
	public void init() throws ServletException {
		super.init();
		this.promocionServicio = new PromocionServicio();
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Long id = Long.parseLong(req.getParameter("id"));
		
		try {
			promocionServicio.delete(id);
		} catch (Exception e) {
			throw new MissingDataException(e);
		}

		resp.sendRedirect("/turismoHDR/dashboard.jsp");
	}

}
