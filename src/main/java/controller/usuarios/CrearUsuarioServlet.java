package controller.usuarios;

import java.io.IOException;

import com.oracle.wls.shaded.org.apache.xpath.operations.Bool;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.TipoAtraccion;
import model.Usuario;
import services.UsuarioService;

@WebServlet("/insertar-usuario.do")
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
				.getRequestDispatcher("/insertar-usuario.jsp");
		dispatcher.forward(req, resp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//int id = Integer.parseInt(req.getParameter("id"));
		String nombre = req.getParameter("nombre");
		System.out.println(nombre);
		String password = req.getParameter("password");
		System.out.println(password);
		double presupuesto = Double.parseDouble(req.getParameter("presupuesto"));
		System.out.println(presupuesto);
		double tiempoDisponible = Double.parseDouble(req.getParameter("tiempoDisponible"));
		System.out.println(tiempoDisponible);
		TipoAtraccion tipoFavorito = TipoAtraccion.valueOf(req.getParameter("tipoDeAtraccion"));//aca solo se me ocurre parsearlo como String, pero habria que reformatear el metodo de creacion
		System.out.println(tipoFavorito);
		//String tipoFavorito = req.getParameter("tipoFavorito");
		boolean admin = false;//req.getParameter("bool"));
		System.out.println(admin);
		
		/*
		 * <option selected>Tipo De atracciones</option>
								<%@ page import="model.TipoAtraccion" %>
								<% pageContext.setAttribute("tipoDeAtraccion", model.TipoAtraccion.values()); %>
								<c:forEach var="entry" items="${tipoDeAtraccion}">
								    <option>${entry.name()}</option>
								</c:forEach>
		 */

		//int id, String nombre, double presupuesto, double tiempoDisponible, TipoAtraccion tipoFavorito,String password, Boolean admin
		//User tmp_user = userService.create(username, password, coins, time);
		Usuario usuario_2 = null;
		try {
			//String nombre, Double presupuesto, Double tiempoDisponible, TipoAtraccion tipoFavorito,String password, Boolean admin
			usuario_2 = usuarioService.crear(nombre, presupuesto, tiempoDisponible, tipoFavorito, password, admin);
			//usuario_2 = usuarioService.crear(id,nombre, presupuesto, tiempoDisponible, tipoFavorito, password, admin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//String nombre, String password, double presupuesto, Double tiempoDisponible,String tipoFavorito
		//String nombre, String password, Double presupuesto, Double tiempoDisponible,TipoAtraccion tipoFavorito
		if (usuario_2.esUsuarioValido(nombre, password, presupuesto, tiempoDisponible, tipoFavorito)) {
			resp.sendRedirect("/turismoHDR/listar-usuario.do");
		} else {
			req.setAttribute("usuario", usuario_2);

			RequestDispatcher dispatcher = getServletContext()
					.getRequestDispatcher("/insertar-usuario.jsp");
			dispatcher.forward(req, resp);
		}
	}

}
