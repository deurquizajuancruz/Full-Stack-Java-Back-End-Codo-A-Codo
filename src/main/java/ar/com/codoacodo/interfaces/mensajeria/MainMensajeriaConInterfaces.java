package ar.com.codoacodo.interfaces.mensajeria;

public class MainMensajeriaConInterfaces {

	public static void main(String[] args) {
		String target ="A";
		String mensaje = "Aprendiendo interfaces en java";
		var m = new Mensajero();
		switch (target) {
		case "A":
			m.setmensajeria(new EnviarMailImpl());
			break;
		case "B":
			m.setmensajeria(new EnviarHDImpl());
			break;
		case "C":
			m.setmensajeria(new EnviarDBImpl());
			break;
		default:
			System.out.println("Opcion invalida");
			break;
		}
		if (m.tieneMensajeria())
			m.mandarMensaje(mensaje);
	}
}
