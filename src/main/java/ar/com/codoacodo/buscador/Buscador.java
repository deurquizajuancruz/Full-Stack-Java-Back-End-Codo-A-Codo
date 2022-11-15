package ar.com.codoacodo.buscador;

public class Buscador {
	private String claveBusqueda;
	private Articulo[] resultados;
	private int cantidadArticulos;
	
	public Buscador() {
		System.out.println("Se instancio un buscador");
		this.resultados = new Articulo[3];
	}
	
	public void buscar() {
		System.out.println("Buscando..."+this.claveBusqueda);
		
		Articulo res1 = new Articulo();
		Articulo res2 = new Articulo();
		Articulo res3 = new Articulo();
		this.resultados[0]=res1;
		this.resultados[1]=res2;
		this.resultados[2]=res3;
		this.cantidadArticulos = this.resultados.length;
	}
	
	public int getCantidadArticulos() {
		return this.cantidadArticulos;
	}
	
	public String getClaveBusqueda() {
		return this.claveBusqueda;
	}
	
	public void cambiarClave(String nuevaClave) {
		this.claveBusqueda=nuevaClave;
	}
}
