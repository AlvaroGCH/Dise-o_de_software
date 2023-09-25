package af;

public abstract class Playmobil {

	String pieza;
	String ficha;
	String accesorio;
	
	public Playmobil(String pieza, String ficha, String accesorio) {
		this.pieza = pieza;
		this.ficha = ficha;
		this.accesorio = accesorio;
	}
	
	public abstract void mostrarDatos();

}
