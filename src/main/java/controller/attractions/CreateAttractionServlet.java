package controller.attractions;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Atraccion;
import services.AtraccionService;


@WebServlet("/attractions/create.do")
public class CreateAttractionServlet extends HttpServlet {

	private static final long serialVersionUID = 3455721046062278592L;
	private AtraccionService atraccionService;

	@Override
	public void init() throws ServletException {
		super.init();
		this.atraccionService = new AtraccionService();
	}

	/*
	 * Muestra el formulario para crear atracción
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/views/attractions/create.jsp");
		dispatcher.forward(req, resp);
	}
	/*
	 * Envía los datos introducidos en el formulario para crear la atracción
	 */

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nombre = req.getParameter("nombre");
		Double costo = Double.parseDouble(req.getParameter("costo"));
		Double tiempo = Double.parseDouble(req.getParameter("tiempo"));
		Integer cupoDisponible = Integer.parseInt(req.getParameter("cupoDisponible"));
		String tipoDeAtraccion = req.getParameter("tipoDeAtraccion");
		//String name, Integer cost, Integer duration, Integer capacity, String tipo
		Atraccion atraccion = null;
		try {
			atraccion = atraccionService.crear(nombre, costo, tiempo, cupoDisponible,tipoDeAtraccion);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (atraccion.esValido(nombre, costo, tiempo, cupoDisponible,tipoDeAtraccion)) {
			resp.sendRedirect("/turismoHDR/attractions/index.do");
		} else {
			req.setAttribute("atraccion", atraccion);

			RequestDispatcher dispatcher = getServletContext()
					.getRequestDispatcher("/views/attractions/create.jsp");
			dispatcher.forward(req, resp);
		}

	}

}