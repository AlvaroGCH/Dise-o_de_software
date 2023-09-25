package CalculoCombateSingleton;

import Aviones.Enemigo;
import Aviones.Jugador;


public class CalculoCombate {

	private static CalculoCombate instancia = null;

	public static CalculoCombate instance() {
		if (instancia == null) {
			instancia = new CalculoCombate();
		}
		return instancia;
	}

	public void CalcAtaqueBalas(Jugador j, Enemigo e, boolean enemigo) {
		int danoPersonaje = j.getVida() - (e.getFuerza() / j.getDefensa());
		int danoEnemigo = e.getVida() - (j.getFuerza() / e.getDefensa());
		int vidaActualPersonaje = danoPersonaje;
		int vidaActualEnemigo = danoEnemigo;
		System.out.println(j.getVida());

		if (enemigo) {
			j.setVida(vidaActualPersonaje);
		} else {
			e.setVida(vidaActualEnemigo);
		}

		System.out.println("La vida de: ");

		if (enemigo) {
			System.out.println("Pesonaje: " + j.getVida());
		} else {
			System.out.println("Enemigo: " + e.getVida());
		}

	}

	public void calcAtqueMisil(Jugador j, Enemigo e, boolean enemigo) {
		int danoJugador = j.getVida() - ((e.getFuerza() * 3) / j.getDefensa());
		int danoEnemigo = e.getVida() - ((j.getFuerza() * 3) / e.getDefensa());
		int vidaActualJugador = danoJugador;
		int vidaActualEnemigo = danoEnemigo;

		if (enemigo) {
			j.setVida(vidaActualJugador);
		} else {
			e.setVida(vidaActualEnemigo);
		}

		System.out.println("La vida de: ");

		if (enemigo) {
			System.out.println("Jugador: " + j.getVida());
		} else {
			System.out.println("Enemigo: " + e.getVida());
		}

	}
	public void calcAtqueLaser(Jugador j, Enemigo e, boolean enemigo) {
		int danoJugador = j.getVida() - ((e.getFuerza() * 2) / j.getDefensa());
		int danoEnemigo = e.getVida() - ((j.getFuerza() * 2) / e.getDefensa());
		int vidaActualJugador = danoJugador;
		int vidaActualEnemigo = danoEnemigo;

		if (enemigo) {
			j.setVida(vidaActualJugador);
		} else {
			e.setVida(vidaActualEnemigo);
		}

		System.out.println("La vida de: ");

		if (enemigo) {
			System.out.println("Jugador: " + j.getVida());
		} else {
			System.out.println("Enemigo: " + e.getVida());
		}

	}
}
