package VueloDecorator;

public class RafagaLaser extends Decorator_method{

	public RafagaLaser(Ataque ataque) {
		super(ataque);
	}
	
	public String infoAtaque() {
		return getAtaques().infoAtaque() + "Realizando una descarga laser sobre el objetivo.";
	}


}
