package ar.com.codoacodo.herencia;

public class MainConsolas {

	public static void main(String[] args) {
		Xbox xbox = new Xbox();
		PlayStation play1 = new PlayStation(32,1);
		PlayStation play2 = new PlayStation(128,2);
		PlayStation play3 = new PlayStation(256,3);
		PlayStation play4 = new PlayStation(512,4);
		PlayStation play5 = new PlayStation(1024,5);
		SegaGenesis sega = new SegaGenesis();
		
		xbox.mostrar();
		play1.mostrar();
		play2.mostrar();
		play3.mostrar();
		play4.mostrar();
		play5.mostrar();
		sega.mostrar();
	}

}
