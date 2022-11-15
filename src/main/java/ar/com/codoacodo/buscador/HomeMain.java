package ar.com.codoacodo.buscador;

public class HomeMain {

	public static void main(String[] args) {
		Buscador miBuscador = new Buscador();
		miBuscador.cambiarClave("Iron Man");
		miBuscador.buscar();
		System.out.println("Hemos encontrado "+miBuscador.getCantidadArticulos()+" resultados para "+miBuscador.getClaveBusqueda());
	}

}
