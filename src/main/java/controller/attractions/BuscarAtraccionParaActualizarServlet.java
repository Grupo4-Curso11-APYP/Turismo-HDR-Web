package controller.attractions;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import services.AtraccionService;

@WebServlet("/actualizar-atraccion.do")
public class BuscarAtraccionParaActualizarServlet extends HttpServlet {
	private static final long serialVersionUID = 7156352618798976882L;
	private AtraccionService atraccionService;

	@Override
	public void init() throws ServletException {
		super.init();
		this.atraccionService = new AtraccionService();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Long id = Long.parseLong(req.getParameter("id"));
	
		req.setAttribute("id", id);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/actualizar-atraccion-form.jsp");
		dispatcher.forward(req, resp);
	}

}
