package ar.com.codoacodo.herencia;

import ar.com.codoacodo.herencia.interfaces.IActualizable;

public class PlayStation extends Consola implements IActualizable {
	private int version;
	
	public PlayStation(int b,int version) {
		super("Play Station",b, "Sony");
		this.version=version;
	}

	public int getVersion() {
		return version;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Version: "+this.version;
	}

	@Override
	public void actualizar() {
		System.out.println("Actualizando Play "+this.version);
		System.out.println("Conectando al servidor de Sony...");
		System.out.println("Descargando nuevo software...");
	}
}
