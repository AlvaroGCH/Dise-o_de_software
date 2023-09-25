package Dec;

public class WeeKid  extends DecoratorNinio{

	public String libro;
		public WeeKid(ComponenteNinio recompensa, String libro) {
		super(recompensa);
		this.libro=libro;
	}
	protected void info() {
		System.out.println(" eres el niño de la semana");
	}
	public void mostrar() {
		System.out.println();
		super.mostrar();
		info();
		preguntarLibro();
	}
	public void preguntarLibro() {
		System.out.println();
		System.out.println("Titulo del libro: ");
		System.out.println("libro");
	}

}
