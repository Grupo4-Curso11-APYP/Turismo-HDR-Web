package controller.attractions;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Atraccion;
import services.AtraccionService;

@WebServlet("/borrar-atraccion.do")
public class DeleteAttractionServlet extends HttpServlet {

	private static final long serialVersionUID = 1537949074766873118L;
	private AtraccionService atraccionService;

	@Override
	public void init() throws ServletException {
		super.init();
		this.atraccionService = new AtraccionService();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Long id = Long.parseLong(req.getParameter("id"));
		//Integer id = Integer.parseInt(req.getParameter("id"));
		//String id = req.getParameter("id");//Long.parseLong(req.getParameter("id"));
		/*
		Atraccion atraccion = atraccionService.find(id);
		req.setAttribute("attraction", atraccion);

		try {
			atraccionService.delete(id);
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		*/
		try {
			atraccionService.delete(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		resp.sendRedirect("/turismoHDR/dashboard.jsp");
	}


}
