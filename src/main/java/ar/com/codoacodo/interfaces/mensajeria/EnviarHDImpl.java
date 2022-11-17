package ar.com.codoacodo.interfaces.mensajeria;

public class EnviarHDImpl implements IEnviar {
	private String systemPath= "/temp/miusuario";
	
	public void enviar(String msj) {
		System.out.println("Grabando en " + this.systemPath);
		System.out.println("Mensaje "+msj);
	}
}
