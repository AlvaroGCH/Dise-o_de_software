package af;

public class LegoAmericano extends Lego{

	public LegoAmericano(String pieza, String ficha, String accesorio, String sensor) {
		super(pieza, ficha, accesorio, sensor);
	}
	
	public void mostrarDatos() {
		System.out.println("Pieza Americana: "+this.pieza);
		System.out.println("Ficha Americana: "+this.ficha);
		System.out.println("Accesorio Americano: "+this.accesorio);
		System.out.println("Sensor Americano: "+this.sensor);
		System.out.println();
	}

}
