package ar.com.codoacodo.interfaces.mensajeria;

public class EnviarDBImpl implements IEnviar {
	
	private String username;
	private String password;
	private String host;
	
	@Override
	public void enviar(String msj) {
		System.out.println("Conectando a MySQL con username" + this.username+" y password " + this.password);
		System.out.println("Conectando al host" +this.host);
		System.out.println("Insertando en la tabla el mensaje " +msj);
	}

}
