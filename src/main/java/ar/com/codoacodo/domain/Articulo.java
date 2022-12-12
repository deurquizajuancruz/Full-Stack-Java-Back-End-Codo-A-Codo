package ar.com.codoacodo.domain;

public class Articulo {
	private String img;
	private String titulo;
	private String autor;
	private float precio; 
	private Long id;
	
	public Articulo(String img, String titulo, String autor, float precio, Long id) {
		this.img = img;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.id = id;
	}

	public Articulo(String img, String titulo, String autor, float precio) {
		this.img = img;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}
	
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void detalle() {
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Autor: " + this.autor);
		System.out.println("Imagen: " + this.img);
		System.out.println("Precio: " + this.precio);
		System.out.println("ID: " + this.id);
	}
}
