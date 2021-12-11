package controller.attractions;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Atraccion;
import model.TipoAtraccion;
import services.AtraccionService;

@WebServlet("/actualizar-atraccion-form.do")
public class EditAttractionServlet extends HttpServlet {

	private static final long serialVersionUID = 7598291131560345626L;
	private AtraccionService atraccionService;

	@Override
	public void init() throws ServletException {
		super.init();
		this.atraccionService = new AtraccionService();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer cupo = Integer.parseInt(req.getParameter("cupo"));
		Atraccion atraccion = (Atraccion) req.getSession().getAttribute("atraccionAEditar");
		atraccionService.update(atraccion, cupo);
		if (atraccion.esValido(cupo)) {
			resp.sendRedirect("/turismoHDR/listar-atraccion.do");
		} else {
			//req.setAttribute("atraccionAEditar", atraccion);

			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/actualizar-atraccion-form.jsp");
			dispatcher.forward(req, resp);
		}
	}
	
}
