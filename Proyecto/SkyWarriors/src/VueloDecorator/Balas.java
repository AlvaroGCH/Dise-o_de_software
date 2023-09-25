package VueloDecorator;

public class Balas extends Decorator_method {

	public Balas(Ataque ataque) {
		super(ataque);
	}
	
	public String infoAtaque() {
		return getAtaques().infoAtaque() + "Apretando el gatillo para lanzar una rafaga de balas sobre el objetivo.\n";
	}


}
