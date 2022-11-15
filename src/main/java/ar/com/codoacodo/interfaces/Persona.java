package ar.com.codoacodo.interfaces;

public class Persona {
	private String nombre;
	private String idioma;
	private String[] otrosIdiomas;
	
	public Persona(String nombre, String idioma) {
		this.nombre=nombre;
		this.idioma=idioma;
		this.otrosIdiomas= new String[] {};
	}
	
	public void decir(String palabra) {
		System.out.println(this.getNombre()+ " dice "+palabra+" en " +this.getIdioma());
	}
	
	public boolean existe(String idioma) {
		boolean esta=false;
		for (int i=0; !esta && i<this.otrosIdiomas.length;i++) {
			esta= this.otrosIdiomas[i]==idioma;
		}
		return esta;
	}
	
	public void decir(String algo, String idioma) {
		if (this.idioma.equals(idioma) || this.existe(idioma))
			System.out.println(this.getNombre() + " puede decir "+algo+ " en "+idioma);
		else
			System.out.println(this.getNombre()+" no sabe hablar "+idioma);
	}
	
	public void aprender(String nuevoIdioma) {
		if (!this.idioma.equals(nuevoIdioma) && !this.existe(nuevoIdioma)) {
			String[] nuevosIdiomas = new String[this.otrosIdiomas.length+1];
			for (int i=0;i<this.otrosIdiomas.length;i++) {
				nuevosIdiomas[i]=this.otrosIdiomas[i];
			}
			nuevosIdiomas[this.otrosIdiomas.length]=nuevoIdioma;
			setOtrosIdiomas(nuevosIdiomas);
			System.out.println(this.nombre+" no sabia "+nuevoIdioma+" pero ya lo aprendio");
		}
		else
			System.out.println(this.nombre+" ya sabe "+nuevoIdioma);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String[] getOtrosIdiomas() {
		return otrosIdiomas;
	}

	public void setOtrosIdiomas(String[] otrosIdiomas) {
		this.otrosIdiomas = otrosIdiomas;
	}

	public String getIdioma() {
		return idioma;
	}
	
	
}
