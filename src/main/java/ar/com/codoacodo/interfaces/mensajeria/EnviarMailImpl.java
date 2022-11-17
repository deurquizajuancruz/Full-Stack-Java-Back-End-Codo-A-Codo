package ar.com.codoacodo.interfaces.mensajeria;

public class EnviarMailImpl implements IEnviar {
	private String emailTarget = "destino@mail.com";
	private String emailSource = "yo@gmail.com";
	private String provider = "gmail";
	
	public void enviar(String msj) {
		System.out.println("Enviando mail a " +this.emailTarget);
		System.out.println("Enviando desde "+this.emailSource);
		System.out.println("Usuario "+ this.provider);
	}
}
