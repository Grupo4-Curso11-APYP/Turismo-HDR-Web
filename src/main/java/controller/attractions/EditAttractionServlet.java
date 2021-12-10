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
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id = Integer.parseInt(req.getParameter("id"));
		//String id = req.getParameter("id");//Long.parseLong(req.getParameter("id"));

		Atraccion atraccion = atraccionService.find(id);
		req.setAttribute("attraction", atraccion);

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/actualizar-atraccion-form.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Integer id = Integer.parseInt(req.getParameter("id"));
		Integer id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("nombre");
		Integer cost = Integer.parseInt(req.getParameter("costo"));
		// Integer cost = req.getParameter("cost").trim() == "" ? null : Integer.parseInt(req.getParameter("cost"));
		Double duration = Double.parseDouble(req.getParameter("duracion"));
		Integer capacity = Integer.parseInt(req.getParameter("capacidad"));

		Atraccion atraccion = atraccionService.update(id, name, cost, duration, capacity);

		if (atraccion.esValido(name, capacity, capacity, capacity, name)) {
			resp.sendRedirect("/turismoHDR/listar-atraccion.jsp");
		} else {
			req.setAttribute("attraccion", atraccion);

			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/turismoHDR/actualizar-atraccion-form.jsp");
			dispatcher.forward(req, resp);
		}
	}
	
}
