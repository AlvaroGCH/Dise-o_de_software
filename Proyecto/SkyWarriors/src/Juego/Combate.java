package Juego;

import java.util.Scanner;

import AtaquesTemplate.*;
import Aviones.*;
import CalculoCombateSingleton.CalculoCombate;
import JugadorStrategy.*;
import VueloDecorator.*;

public class Combate {
	private Jugador jugador;
	private Enemigo enemigo;

	Scanner sc = new Scanner(System.in);

	public Combate() {
		System.out.println("Elige el avion que quieres:\n1-F18 \n2-F22 \n3-Eurofighter");
		int av = sc.nextInt();
		FabricaAviones Fabrica = new FabricaCaza();
		if (av == 1) {
			this.jugador = Fabrica.crearCazaF18();
		} else if (av == 2) {
			this.jugador = Fabrica.crearCazaF22();
		} else if (av == 3) {
			this.jugador = Fabrica.crearEurofighter();

		}
		
		System.out.println("Elige el avion que quieres para el enemigo:\n1-Tu2 \n2-Tb3 \n3-Yak3");
		int enemigos = sc.nextInt();
		FabricaAvionesRusos FabricaEnemigo = new FabricaCazaRusos();
		if (enemigos == 1) {
			this.enemigo = FabricaEnemigo.crearCazaTu2();
		} else if (enemigos == 2) {
			this.enemigo = FabricaEnemigo.crearCazaTb3();
		} else if (enemigos == 3) {
			this.enemigo = FabricaEnemigo.crearCazaYak3();

		}

		
	}

	public void todo() {
		System.out.println("Iniciando vuelo...");
		System.out.println("Despegando...");
		System.out.println("�Que gane el mejor!");
		System.out.println();

		this.estrategiaJugador();
		this.combate();
	}

	public void estrategiaJugador() {
		System.out.println("Seleccione su modo de combate:");
		System.out.println("1. Modo ofensivo");
		System.out.println("2. Modo defensivo");
		int opcion = sc.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("\nEntrando en modo ofensivo");
			ControladorEstrategia EsOfens = new ControladorEstrategia(new Ofensiva());
			EsOfens.eleccionInicial(jugador);
			break;

		case 2:
			System.out.println("\nEntrando en modo defensivo");
			ControladorEstrategia EsDefens = new ControladorEstrategia(new Defensiva());
			EsDefens.eleccionInicial(jugador);
			break;

		default:
			System.err.println("**** ERROR ****");
			break;
		}
	}

	public void combate() {
		do {
			
			System.out.println("Turno del jugador:");
			System.out.println("Seleccione su movimiento:");
			System.out.println("1. Disparo rapido");
			System.out.println("2. Disparo laser");
			System.out.println("3. Lanzar misil");

			int opcion = sc.nextInt();

			CalculoCombate dano = CalculoCombate.instance();

			Ataque ataque = new AtaquePrincipal();
			
			String reset = "\u001B[0m";
	        String red = "\u001B[31m";
	        String green = "\u001B[32m";
	        int entero = 56;
			switch (opcion) {
			case 1:
				ataque = new Balas(ataque);
				dano.CalcAtaqueBalas(jugador, enemigo, false);
				System.out.println(ataque.infoAtaque());
				System.out.println(green+"�El jugador ha realizado un ataque de ametralladora!"+ entero);
				break;

			case 2:
				ataque = new RafagaLaser(ataque);
				dano.calcAtqueLaser(jugador, enemigo, false);
				System.out.println(ataque.infoAtaque());
				System.out.println(green+"�El jugador ha realizado un ataque especial laser!");
				break;

			case 3:
				ataque = new Misil(ataque);
				dano.calcAtqueMisil(jugador, enemigo, false);
				System.out.println(ataque.infoAtaque());
				System.out.println(green+"�El jugador ha lanzado un misil!");
				break;

			default:
				System.err.println(red+"Ataque no v�lido");
				break;
			}

			System.out.println();

			int opcRand = (int) (Math.random() * (3 - 1 + 1) + 1);

			switch (opcRand) {
			case 1:
				AtaqueEnemigo ataque1 = new AtaqueRafaga();
				ataque1.ejecutarAtaque();
				dano.CalcAtaqueBalas(jugador, enemigo, true);
				break;

			case 2:
				AtaqueEnemigo ataque2 = new AtaqueLaser();
				ataque2.ejecutarAtaque();
				dano.calcAtqueLaser(jugador, enemigo, true);
				break;

			case 3:
				AtaqueEnemigo ataque3 = new AtaqueMisil();
				ataque3.ejecutarAtaque();
				dano.calcAtqueMisil(jugador, enemigo, true);
				break;

			default:
				System.err.println("Ataque no v�lido");
				break;
			}

			System.out.println();

			int vidaEnemigo = enemigo.getVida();
			int vidaJugador = jugador.getVida();

			System.out.println("Estado actual del enemigo:" + vidaEnemigo);

			System.out.println();

			System.out.println("Estado actual del jugador:" + vidaJugador);
			System.out.println();
		} while (jugador.getVida() > 0 && enemigo.getVida() > 0);

		if (jugador.getVida() <= 0) {
			System.out.println("�El jugador ha perdido!");
		} else {
			System.out.println("�El jugador ha ganado!");
		}
	}
}
