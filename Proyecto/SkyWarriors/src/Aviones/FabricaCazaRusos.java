package Aviones;

public class FabricaCazaRusos implements FabricaAvionesRusos {

	public Enemigo crearCazaYak3() {

		return new Enemigo(80, 120, 8);
	}

	public Enemigo crearCazaTu2() {
		return new Enemigo(75, 105, 6);
	}

	
	public Enemigo crearCazaTb3() {
		return new Enemigo(110, 75, 9);
	}

}
