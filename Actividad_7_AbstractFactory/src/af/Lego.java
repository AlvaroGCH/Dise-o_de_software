package af;

public abstract class Lego {

	String pieza;
	String ficha;
	String accesorio;
	String sensor;
	
	public Lego(String pieza, String ficha, String accesorio, String sensor) {
		this.pieza = pieza;
		this.ficha = ficha;
		this.accesorio = accesorio;
		this.sensor = sensor;
	}
	
	public abstract void mostrarDatos();
}
