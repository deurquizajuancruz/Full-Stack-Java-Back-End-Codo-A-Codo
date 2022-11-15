package ar.com.codoacodo.buscador;

public class Articulo {
	private String img;
	private String titulo;
	private String autor;
	private float precio;
	
	public Articulo() {
		
	}
	
	public void detalle() {
		System.out.println("Imagen: "+this.img);
		System.out.println("Titulo"+this.titulo);
		System.out.println("Autor"+this.autor);
		System.out.println("Precio"+this.precio);
	}
}
