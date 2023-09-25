package Aviones;

public class FabricaCaza implements FabricaAviones{
	

	@Override
	public Jugador crearCazaF18() {
		// TODO Auto-generated method stub
		return new Jugador(160,80,7);
	}

	@Override
	public Jugador crearCazaF22() {
		// TODO Auto-generated method stub
		return new Jugador(80,150,5);
		
	}

	@Override
	public Jugador crearEurofighter() {
		// TODO Auto-generated method stub
		return new Jugador(160,40,10);
		
	}
}
