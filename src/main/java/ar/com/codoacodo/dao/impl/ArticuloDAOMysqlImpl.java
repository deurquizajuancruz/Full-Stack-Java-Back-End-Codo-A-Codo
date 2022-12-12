package ar.com.codoacodo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ar.com.codoacodo.domain.Articulo;
import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.db.AdministradorDeConexiones;

public class ArticuloDAOMysqlImpl implements IArticuloDAO {
	
	public Articulo fromResultSetToArticulo(ResultSet resultSet) throws Exception {
		return new Articulo(resultSet.getString("img"), 
				resultSet.getString("titulo"), 
				resultSet.getString("autor"), 
				resultSet.getFloat("precio"), 
				resultSet.getLong("id"));
	}
	
	
	@Override
	public Articulo getById(Long id) throws Exception {

		Connection connection = AdministradorDeConexiones.getConnection();

		String sql = "select * from articulo where id = " + id;
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		Articulo articulo = null;
		if (resultSet.next()) {
			articulo = fromResultSetToArticulo(resultSet);
		}
		return articulo;
	}

	@Override
	public List<Articulo> findAll() throws Exception {
		Connection connection = AdministradorDeConexiones.getConnection();

		String sql = "select * from articulo";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		List<Articulo> articulos = new ArrayList<>();
		while (resultSet.next()) {
			articulos.add(fromResultSetToArticulo(resultSet));
		}
		return articulos;
	}

	@Override
	public void create(Articulo articulo) throws Exception {
		Connection connection = AdministradorDeConexiones.getConnection();
		String sql = "insert into articulo (titulo,autor,precio,img) values(?,?,?,?)";
		PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
		
		statement.setString(1, articulo.getTitulo());
		statement.setString(2, articulo.getAutor());
		statement.setFloat(3, articulo.getPrecio());
		statement.setString(4, articulo.getImg());
		
		statement.execute();
		ResultSet res = statement.getGeneratedKeys();
		if (res.next()) {
			articulo.setId(res.getLong(1));
		}
	}

	@Override
	public void delete(Long id) throws Exception {
		Connection connection = AdministradorDeConexiones.getConnection();

		String sql = "delete from articulo where id = "+ id;
		Statement statement = connection.createStatement();
		int resultSet = statement.executeUpdate(sql);
		System.out.println(resultSet);

	}

	@Override
	public void update(Articulo articulo) throws Exception {
		Connection connection = AdministradorDeConexiones.getConnection();
		String sql = "update articulo set titulo=?,autor=?,precio=?,img=? where id=?";
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setString(1, articulo.getTitulo());
		statement.setString(2, articulo.getAutor());
		statement.setFloat(3, articulo.getPrecio());
		statement.setString(4, articulo.getImg());
		statement.setLong(5, articulo.getId());
		
		statement.execute();

	}

}
