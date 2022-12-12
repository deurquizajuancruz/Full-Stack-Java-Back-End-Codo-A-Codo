package ar.com.codoacodo.controllers;

import java.util.List;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.domain.Articulo;

public class GetArticuloController {

	public static void main(String[] args) throws Exception {
		
		IArticuloDAO dao = new ArticuloDAOMysqlImpl();
		
		System.out.println("ARTICULO CON UN ID: ");
		Articulo articuloBuscado = dao.getById(1l);
		articuloBuscado.detalle();
		
		System.out.println("TODOS LOS ARTICULOS: ");
		List<Articulo> todos = dao.findAll();
		todos.stream().forEach(x->x.detalle());
		
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
