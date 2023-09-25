package AtaquesTemplate;

public class AtaqueLaser extends AtaqueEnemigo {

	@Override
	protected void efectuarAtaque() {
		System.out.println(
			"El enemigo está disparando un rayo láser. Esquívalo o prepárate para recibir daño!");
	}
	
	@Override
	public String getDescripcionAtaque() {
		return "Un ataque de rayo láser que inflige un gran daño.";
	}
}

