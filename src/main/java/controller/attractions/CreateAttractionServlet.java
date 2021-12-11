package controller.attractions;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Atraccion;
import model.TipoAtraccion;
import services.AtraccionService;


@WebServlet("insertar-atraccion.do")
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

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/insertar-atraccion.jsp");
		//RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/views/attractions/create.jsp");
		dispatcher.forward(req, resp);
	}
	/*
	 * Envía los datos introducidos en el formulario para crear la atracción
	 */

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req);
		String nombre = req.getParameter("nombre");
		System.out.println(nombre);
		Double costo = Double.parseDouble(req.getParameter("costo"));
		System.out.println(costo);
		Double tiempo = Double.parseDouble(req.getParameter("tiempo"));
		System.out.println(tiempo);
		Integer cupoDisponible = Integer.parseInt(req.getParameter("cupoDisponible"));
		System.out.println(cupoDisponible);
		TipoAtraccion tipoDeAtraccion = TipoAtraccion.valueOf(req.getParameter("tipoDeAtraccion"));
		//TipoAtraccion tipoDeAtraccion = TipoAtraccion.valueOf(req.getParameter("tipoDeAtraccion")); <===== asi estaba antes
		//(req.getParameter("tipoDeAtraccion"));
		//String name, Integer cost, Integer duration, Integer capacity, String tipo
		Atraccion atraccion = new Atraccion();
		try {
			atraccion = atraccionService.crear(nombre, costo, tiempo, cupoDisponible,tipoDeAtraccion);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (atraccion.esValidoFull(nombre, costo, tiempo, cupoDisponible,tipoDeAtraccion)) {
			resp.sendRedirect("/turismoHDR/listar-atraccion.do");
		} else {
			req.setAttribute("atraccion", atraccion);

			RequestDispatcher dispatcher = getServletContext()
					.getRequestDispatcher("/insertar-atraccion.jsp");
			dispatcher.forward(req, resp);
		}
		

	}

}