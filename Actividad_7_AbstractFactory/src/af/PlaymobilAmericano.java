package af;

public class PlaymobilAmericano extends Playmobil{

	public PlaymobilAmericano(String pieza, String ficha, String accesorio) {
		super(pieza, ficha, accesorio);
	}
	
	public void mostrarDatos() {
		System.out.println("Pieza Americana: "+this.pieza);
		System.out.println("Ficha Americana: "+this.ficha);
		System.out.println("Accesorio Americano: "+this.accesorio);
		System.out.println();
	}

}
