package controller.usuarios;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import persistence.commons.MissingDataException;
import services.PromocionServicio;
import services.UsuarioService;


@WebServlet("/borrar-usuario.do")
public class BorrarUsuarioServlet extends HttpServlet {	
    
	private static final long serialVersionUID = -8884186389844194147L;
	private UsuarioService usuarioService;

	@Override
	public void init() throws ServletException {
		super.init();
		this.usuarioService = new UsuarioService();
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Long id = Long.parseLong(req.getParameter("id"));
		
		try {
			usuarioService.delete(id);
		} catch (Exception e) {
			throw new MissingDataException(e);
		}

		resp.sendRedirect("/turismoHDR/dashboard.jsp");
	}

    
}
