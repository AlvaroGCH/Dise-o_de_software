package JugadorStrategy;

import Aviones.Jugador;

public class Defensiva implements Strategy {

	@Override
	public void eleccionInicial(Jugador j) {
		int defensaExtra = 15;
		int defensaJugador = j.getDefensa();
		int defensaAumentada = defensaJugador + defensaExtra;

		System.out.println("Has adoptado una posición defensiva, tu defensa ha aumentado en: " + defensaAumentada);
	}

}