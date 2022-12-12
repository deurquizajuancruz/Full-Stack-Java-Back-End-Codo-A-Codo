package ar.com.codoacodo.buscador;

public class Articulo {
	private String img;
	private String titulo;
	private String autor;
	private float precio; 
	
	public void detalle() {
		System.out.println("Imagen " + this.img);
		System.out.println("Precio " + this.precio);
	}
}
