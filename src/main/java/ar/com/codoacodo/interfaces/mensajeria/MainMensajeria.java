package ar.com.codoacodo.interfaces.mensajeria;

public class MainMensajeria {

	public static void main(String[] args) {
		String target ="A";
		String mensaje = "Aprendiendo interfaces en java";
		Mensajeria m = new Mensajeria();
		switch (target) {
		case "A":
			m.enviarMail(mensaje);
			break;
		case "B":
			m.enviarHD(mensaje);
			break;
		case "C":
			m.enviarADB(mensaje);
			break;
		default:
			System.out.println("Opcion invalida");
			break;
		}
	}

}
