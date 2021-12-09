package controller.usuarios;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.TipoAtraccion;
import model.Usuario;
import services.UsuarioService;

@WebServlet("/usuarios/crear.do")
public class CrearUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UsuarioService usuarioService;

	@Override
	public void init() throws ServletException {
		super.init();
		this.usuarioService = new UsuarioService();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = getServletContext()
				.getRequestDispatcher("/turismoHDR/insertar-usuario.jsp");
		dispatcher.forward(req, resp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = req.getParameter("id");
		String nombre = req.getParameter("nombre");
		double presupuesto = req.getParameter("presupuesto");
		String password = req.getParameter("password");
		Integer coins = Integer.parseInt(req.getParameter("coins"));
		Double time = Double.parseDouble(req.getParameter("time"));

		//int id, String nombre, double presupuesto, double tiempoDisponible, TipoAtraccion tipoFavorito,String password, Boolean admin
		Usuario tmp_user = usuarioService.crear(id,nombre, presupuesto, tiempoDisponible,tipoFavorito, password, admin);
		
		if (tmp_user.esValido(password, password, time, time, null)) {
			resp.sendRedirect("/turismo/users/index.do");
		} else {
			req.setAttribute("tmp_user", tmp_user);

			RequestDispatcher dispatcher = getServletContext()
					.getRequestDispatcher("/views/users/create.jsp");
			dispatcher.forward(req, resp);
		}
	}

}
