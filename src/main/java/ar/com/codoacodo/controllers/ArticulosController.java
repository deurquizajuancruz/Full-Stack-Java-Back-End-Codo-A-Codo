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

@WebServlet("/ArticulosController")
public class ArticulosController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IArticuloDAO dao = new ArticuloDAOMysqlImpl();
		List<Articulo> todos = new ArrayList<>();
		try {
			/*
			 * System.out.println("ARTICULO CON UN ID: "); Articulo articuloBuscado =
			 * dao.getById(1l); articuloBuscado.detalle();
			 */

			System.out.println("TODOS LOS ARTICULOS: ");
			todos = dao.findAll();
			todos.stream().forEach(x -> x.detalle());

			/*
			 * dao.delete(2l);
			 * 
			 * dao.create(new Articulo("http://imagen.com/img.jpg", "Aventuras de Tintin",
			 * "Conan McDoyle", 1050));
			 * 
			 * Articulo articuloActualizar = dao.getById(3l); if (articuloActualizar !=
			 * null) { articuloActualizar.setImg("http://webstock/nueva.png");
			 * dao.update(articuloActualizar); articuloActualizar.detalle(); }
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}

		req.setAttribute("productos", todos);

		// redirect a otra pagina u otro servlet(Controller/WebServlet)
		getServletContext().getRequestDispatcher("/listado.jsp").forward(req, resp);
	}

	public static void main(String[] args) throws Exception {

		IArticuloDAO dao = new ArticuloDAOMysqlImpl();

		System.out.println("ARTICULO CON UN ID: ");
		Articulo articuloBuscado = dao.getById(1l);
		articuloBuscado.detalle();

		System.out.println("TODOS LOS ARTICULOS: ");
		List<Articulo> todos = dao.findAll();
		todos.stream().forEach(x -> x.detalle());

		dao.delete(2l);

		dao.create(new Articulo("http://imagen.com/img.jpg", "Aventuras de Tintin", "Conan McDoyle", 1050));

		Articulo articuloActualizar = dao.getById(3l);
		if (articuloActualizar != null) {
			articuloActualizar.setImg("http://webstock/nueva.png");
			dao.update(articuloActualizar);
			articuloActualizar.detalle();
		}

	}

}
