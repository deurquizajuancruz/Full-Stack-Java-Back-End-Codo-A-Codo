package ar.com.codoacodo.interfaces.mensajeria;

public class Mensajero {
	private IEnviar mensajeria;
	
	public void setmensajeria(IEnviar m) {
		this.mensajeria=m;
	}
	
	public boolean tieneMensajeria() {
		return this.mensajeria!=null;
	}
	
	public void mandarMensaje(String msj) {
		this.mensajeria.enviar(msj);
	}
}
