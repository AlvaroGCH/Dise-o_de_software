package prueba;

public class Cliente {

	private StrategyVuelo vuelo;
	
	public void tipoVuelo() {
		vuelo.executeVuelo();
	}
	public void imprimirFactura() {
		vuelo.executeFactura();
	}
	
	public void setVuelo(StrategyVuelo vuelo) {
		this.vuelo = vuelo;
	}
}
