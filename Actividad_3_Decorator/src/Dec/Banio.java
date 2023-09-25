package Dec;

public class Banio extends DecoratorNinio{

	public Banio(ComponenteNinio recompensa) {
		super(recompensa);

	}

	protected void info() {
		System.out.println(" un certificado");
		System.out.println("");
	}
	
	public void mostrar() {
		super.mostrar();
		info();
	}

}
