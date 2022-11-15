package ar.com.codoacodo.interfaces;

public class MainIdiomas {

	public static void main(String[] args) {
		var persona = new Persona("Carlos","Español");
		persona.decir("Hola mundo");
		persona.decir("chau", "japones");
		persona.decir("Chau", "Español");
		persona.aprender("Español");
		persona.aprender("Japones");
		persona.aprender("Japones");
	}

}
