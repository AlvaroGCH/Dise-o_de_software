package af;

public abstract class Monopoly {

	String pieza;
	String ficha;
	
	public Monopoly(String pieza, String ficha) {
		this.pieza = pieza;
		this.ficha = ficha;
	}
	
	public abstract void mostrarDatos();

}
