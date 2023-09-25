package af;

public class LegoEuropeo extends Lego{

	public LegoEuropeo(String pieza, String ficha, String accesorio, String sensor) {
		super(pieza, ficha, accesorio, sensor);
	}
	
	public void mostrarDatos() {
		System.out.println("Pieza Europea: "+this.pieza);
		System.out.println("Ficha Europea: "+this.ficha);
		System.out.println("Accesorio Europeo: "+this.accesorio);
		System.out.println("Sensor Europeo: "+this.sensor);
		System.out.println();
	}

}
