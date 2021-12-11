package controller.attractions;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import persistence.commons.MissingDataException;
import services.AtraccionService;

@WebServlet("/borrar-atraccion.do")
public class DeleteAttractionServlet extends HttpServlet {

	private static final long serialVersionUID = -8108877554178300148L;
	private AtraccionService attractionService;

	@Override
	public void init() throws ServletException {
		super.init();
		this.attractionService = new AtraccionService();
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Long id = Long.parseLong(req.getParameter("id"));
		
		try {
			attractionService.delete(id);
		} catch (Exception e) {
			throw new MissingDataException(e);
		}

		resp.sendRedirect("/turismoHDR/dashboard.jsp");
	}
}
