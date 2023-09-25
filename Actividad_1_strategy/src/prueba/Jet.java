package prueba;

public class Jet implements StrategyVuelo{

	public void executeVuelo() {
		System.out.println("Vuelo: Jet.");
	}
	public void executeFactura() {
		System.out.println("Importe: 300 euros.");
	}

}
