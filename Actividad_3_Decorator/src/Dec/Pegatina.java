package Dec;

public class Pegatina extends DecoratorNinio{

	public Pegatina(ComponenteNinio recompensa) {
		super(recompensa);
	}
	
	protected void info() {
		System.out.println("Ganaste una pegatina!");
	}
	
	public void mostrar() {
		System.out.println();
		super.mostrar();
		info();
		System.out.println();
	}
}
