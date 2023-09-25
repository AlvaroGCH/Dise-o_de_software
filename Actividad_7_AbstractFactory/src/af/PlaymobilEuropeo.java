package af;

public class PlaymobilEuropeo extends Playmobil{

	public PlaymobilEuropeo(String pieza, String ficha, String accesorio) {
		super(pieza, ficha, accesorio);
	}
	
	public void mostrarDatos() {
		System.out.println("Pieza Europea: "+this.pieza);
		System.out.println("Ficha Europea: "+this.ficha);
		System.out.println("Accesorio Europeo: "+this.accesorio);
		System.out.println();
	}
}
