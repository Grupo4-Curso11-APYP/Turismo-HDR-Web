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

public class pruebaSQL_3_Test {

	@Test
	public void test4() {
		Integer idAtrac = 9;
		Atraccion atraccion = new Atraccion(idAtrac);

		AtraccionDAO attractionDAO = DAOFactory.getAtraccionDAO();
		attractionDAO.delete(atraccion);
		System.out.println(atraccion);
	}
}
