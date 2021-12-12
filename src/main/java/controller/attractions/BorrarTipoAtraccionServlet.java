package controller.attractions;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import persistence.commons.MissingDataException;
import services.TipoAtraccionService;

@WebServlet("/borrar-tipo.do")
public class BorrarTipoAtraccionServlet extends HttpServlet {

	private static final long serialVersionUID = 3454082920449460855L;
	private TipoAtraccionService tipoAtraccionService;

	@Override
	public void init() throws ServletException {
		super.init();
		this.tipoAtraccionService = new TipoAtraccionService();
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		
		try {
			tipoAtraccionService.deleteLogico(id);
		} catch (Exception e) {
			throw new MissingDataException(e);
		}

		resp.sendRedirect("/turismoHDR/dashboard.jsp");
	}
	
}
