package ar.com.codoacodo.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import ar.com.codoacodo.domain.Articulo;
import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.db.AdministradorDeConexiones;

public class ArticuloDAOMysqlImpl implements IArticuloDAO {

	@Override
	public Articulo getById(Long id) throws Exception {
		
		Connection connection = AdministradorDeConexiones.getConnection();
		
		String sql = "select * from articulo where id = "+id;
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		
		if (resultSet.next()) {
			Long idDb = resultSet.getLong("id");
			String tituloDb = resultSet.getString("titulo");
			String autorDb = resultSet.getString("autor");
			float precioDb = resultSet.getFloat("precio");
			String imagenDb = resultSet.getString("img");
			
			return new Articulo(imagenDb, tituloDb, autorDb, precioDb, idDb);
		}
		return null;
	}

}
