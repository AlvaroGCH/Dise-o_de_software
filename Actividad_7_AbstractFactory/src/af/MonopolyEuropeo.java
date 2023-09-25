package af;

public class MonopolyEuropeo extends Monopoly{

	public MonopolyEuropeo(String pieza, String ficha) {
		super(pieza, ficha);
	}
	
	public void mostrarDatos() {
		System.out.println("Pieza Europea: "+this.pieza);
		System.out.println("Ficha Europea: "+this.ficha);
		System.out.println();
	}

}
