package ar.com.codoacodo.herencia;

public class PlayStation extends Consola {
	private int version;
	
	public PlayStation(int b,int version) {
		super("Play Station",b, "Sony");
		this.version=version;
	}

	public int getVersion() {
		return version;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Version: "+this.version;
	}
}
