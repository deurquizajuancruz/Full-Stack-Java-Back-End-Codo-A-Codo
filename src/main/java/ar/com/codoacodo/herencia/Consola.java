package ar.com.codoacodo.herencia;

public class Consola {
	private String nombre;
	protected int bit;
	private String marca;
	
	public Consola(String n, int b, String m) {
		this.nombre=n;
		this.bit=b;
		this.marca=m;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getBit() {
		return bit;
	}

	public String getMarca() {
		return marca;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + this.nombre+" Bits: "+this.bit+" Marca: "+this.marca;
	}
	
	public void mostrar() {
		System.out.println(this.toString());
	}
}
