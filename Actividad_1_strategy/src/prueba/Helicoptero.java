package prueba;

public class Helicoptero implements StrategyVuelo{

	public void executeVuelo() {
		System.out.println("Vuelo: Helicoptero.");
	}
	public void executeFactura() {
		System.out.println("Importe: 200 euros.");
	}

}
