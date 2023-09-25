package JugadorStrategy;

import Aviones.*;

public class Ofensiva implements Strategy {

	@Override
	public void eleccionInicial(Jugador j) {
		int fuerzaExtra = 15;
		int fuerzaJugador = j.getFuerza();
		int fuerzaAumentada = fuerzaJugador + fuerzaExtra;

		System.out.println("Has adoptado una posici�n ofensiva, tu ataque ha aumentado en: " + fuerzaAumentada);
	}

}
