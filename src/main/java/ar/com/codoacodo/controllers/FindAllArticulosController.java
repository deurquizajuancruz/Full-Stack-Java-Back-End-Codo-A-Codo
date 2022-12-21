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

<<<<<<< HEAD
=======
	//http://localhost:8080/webapp/FindAllArticulosController
>>>>>>> 2352103c12b63b2417f1abfc0f3753409d706c3d
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IArticuloDAO dao = new ArticuloDAOMysqlImpl(); 
		
		List<Articulo> articulosBuscados = new ArrayList<>();
		
		try {
<<<<<<< HEAD
			articulosBuscados = dao.findAll();
			//articulosBuscados.stream().forEach(x->x.detalle());
		} catch (Exception e) {
=======
			articulosBuscados = dao.findAll();		
			articulosBuscados.stream().forEach(x->x.detalle());
		}catch(Exception e) {
>>>>>>> 2352103c12b63b2417f1abfc0f3753409d706c3d
			e.printStackTrace();
		}
	
		req.setAttribute("productos", articulosBuscados);
		
<<<<<<< HEAD
		req.setAttribute("productos", articulosBuscados);
		
=======
>>>>>>> 2352103c12b63b2417f1abfc0f3753409d706c3d
		getServletContext().getRequestDispatcher("/listado.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	
		doGet(req, resp);
	}
}