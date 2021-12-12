package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import persistence.commons.ConnectionProvider;
import persistence.commons.MissingDataException;

public class TipoAtraccionService {

	public int deleteLogico(String id) throws SQLException {
		try {
			String sql = "UPDATE TipoAtraccion SET Estado = ? WHERE id_tipoAtraccion LIKE \"%" + id + "%\" ";
			Connection conn = ConnectionProvider.getConnection();

			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, 0);
			
			int rows = statement.executeUpdate();

			return rows;
		} catch (Exception e) {
			throw new MissingDataException(e);
		}
	}

}
