package ar.com.codoacodo.herencia;

import ar.com.codoacodo.herencia.interfaces.IActualizable;

public class Xbox extends Consola implements IActualizable{
	
	public Xbox() {
		super("Xbox 360",256,"Microsoft");
	}

	@Override
	public void actualizar() {
		System.out.println("Conectando Xbox al servidor de Microsoft...");
		System.out.println("Descargando nuevo firmware...");
		System.out.println("Finalizando instalacion...");
	}
	
	
}
