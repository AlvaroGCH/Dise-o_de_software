package af;

public class MonopolyAmericano extends Monopoly{

	public MonopolyAmericano(String pieza, String ficha) {
		super(pieza, ficha);
	}
	
	public void mostrarDatos() {
		System.out.println("Pieza Americana: "+this.pieza);
		System.out.println("Ficha Americana: "+this.ficha);
		System.out.println();
	}

}
