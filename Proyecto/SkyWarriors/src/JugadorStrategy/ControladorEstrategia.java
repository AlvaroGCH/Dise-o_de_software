package JugadorStrategy;

import Aviones.Jugador;

public class ControladorEstrategia {
	private Strategy estrategia;

	public ControladorEstrategia(Strategy estrategia) {
		super();
		this.estrategia = estrategia;
	}

	public Strategy getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(Strategy estrategia) {
		this.estrategia = estrategia;
	}

	public void eleccionInicial(Jugador j) {
		System.out.println("Ejecutando estrategia...");
		estrategia.eleccionInicial(j);
	}
}
