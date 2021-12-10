import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import model.Atraccion;
import model.Attraction;
import persistence.AtraccionDAO;
import persistence.AttractionDAO;
import persistence.commons.ConnectionProvider;
import persistence.commons.DAOFactory;
import persistence.impl.AtraccionDAOImpl;

public class pruebaSQL_2 {

	/*@Test
	public void test() throws SQLException {
		String nombre = "Erebor";
		String sql = "SELECT ID_Atraccion, Nombre FROM Atraccion WHERE Nombre LIKE \"%" + nombre + "%\"";
		// SQLiteDatabase db = this.getWritableDatabase();
		Connection conn = ConnectionProvider.getConnection();
		PreparedStatement statement = conn.prepareStatement(sql);
		ResultSet resultados = statement.executeQuery();
		// int id_atrac = (Integer) null;
		// ResultSet rs = st.executeQuery(query);

		// ArrayList<String> id_atrac = new ArrayList<String>();
		// ArrayList<String> subjects = new ArrayList<String>();
		System.out.println(Integer.parseInt(resultados.getString(1)));
	}

	@Test
	public void test2() throws SQLException {
		long id_Atrac = 2;
		// AtraccionDAO attractionDAO = DAOFactory.getAtraccionDAO();
		// return attractionDAO.buscarPorId(id_Atrac);

		AtraccionDAOImpl atrac = new AtraccionDAOImpl();
		atrac.buscarPorId(id_Atrac);
		System.out.println(atrac);
	}
	
	@Test
	public void test3() throws SQLException {
		String nombreAtrac = "Erebor";
		AtraccionDAO atrac = new AtraccionDAOImpl();
		System.out.println(atrac.find(nombreAtrac));
	}*/
	
	@Test
	public void test4() {
		Integer idAtrac = 9;
		Atraccion atraccion = new Atraccion(idAtrac);

		AtraccionDAO attractionDAO = DAOFactory.getAtraccionDAO();
		attractionDAO.delete(atraccion);
		System.out.println(atraccion);
	}

}
