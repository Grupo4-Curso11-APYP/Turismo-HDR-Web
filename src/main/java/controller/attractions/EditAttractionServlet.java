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
		//Integer id = Integer.parseInt(req.getParameter("id"));
		Integer id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("nombre");
		Double cost = Double.parseDouble(req.getParameter("costo"));
		// Integer cost = req.getParameter("cost").trim() == "" ? null : Integer.parseInt(req.getParameter("cost"));
		Double duration = Double.parseDouble(req.getParameter("duracion"));
		Integer capacity = Integer.parseInt(req.getParameter("capacidad"));
		TipoAtraccion tipoDeAtraccion = TipoAtraccion.valueOf(req.getParameter("tipoDeAtraccion"));//(req.getParameter("tipoDeAtraccion"));
		//Integer id, String name, Double cost, Double duration, Integer capacity,TipoAtraccion tipoDeAtraccion
		Atraccion atraccion = atraccionService.update(id, name, cost, duration, capacity,tipoDeAtraccion);
		//String nombre, Double costo, Double tiempo, Integer cupo, TipoAtraccion tipo
		if (atraccion.esValido(name, cost, duration, capacity, tipoDeAtraccion)) {
			resp.sendRedirect("/turismoHDR/listar-atraccion.jsp");
		} else {
			req.setAttribute("attraccion", atraccion);

			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/actualizar-atraccion-form.jsp");
			dispatcher.forward(req, resp);
		}
	}
	
}
