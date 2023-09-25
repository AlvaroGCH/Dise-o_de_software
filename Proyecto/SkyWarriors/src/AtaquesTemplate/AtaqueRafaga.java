package AtaquesTemplate;

public class AtaqueRafaga extends AtaqueEnemigo {

	@Override
	protected void efectuarAtaque() {
		System.out.println(
			"El enemigo está disparando una ráfaga de disparos. Esquívala o prepárate para recibir daño!");
	}
	
	@Override
	public String getDescripcionAtaque() {
		return "Un ataque de ráfaga que inflige daño moderado pero con gran precisión.";
	}
}