package ar.com.codoacodo.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.domain.Articulo;

@WebServlet("/FindAllArticulosController")
public class FindAllArticulosController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IArticuloDAO dao = new ArticuloDAOMysqlImpl();

		try {
			List<Articulo> articulosBuscado = dao.findAll();

			articulosBuscado.stream().forEach(x -> x.detalle());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {

		// obtener todos los artículos

		IArticuloDAO dao = new ArticuloDAOMysqlImpl();

		List<Articulo> articulosBuscado = dao.findAll();

		articulosBuscado.stream().forEach(x -> x.detalle());
	}

}
