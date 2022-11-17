package ar.com.codoacodo.interfaces.mensajeria;

public class Mensajeria {
	
	public void enviarMail(String mensaje) {
		System.out.println("Enviando mail: " + mensaje);
	}
	
	public void enviarHD(String m) {
		System.out.println("Escribiendo en disco rigido "+ m);
	}
	
	public void enviarADB(String m) {
		System.out.println("Conectando a MySQL");
		System.out.println("Usuario root");
		System.out.println("Password root");
		System.out.println("Insertando en table...");
	}
}
