package Dec;

public abstract class DecoratorNinio implements ComponenteNinio{
	private ComponenteNinio recompensa;
		public DecoratorNinio(ComponenteNinio recompensa) {
		this.recompensa = recompensa;
	}
	public void mostrar() {
		recompensa.mostrar();
	}
}

