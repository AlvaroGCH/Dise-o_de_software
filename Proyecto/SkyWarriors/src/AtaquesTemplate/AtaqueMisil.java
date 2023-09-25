package AtaquesTemplate;

public class AtaqueMisil extends AtaqueEnemigo {

	@Override
	protected void efectuarAtaque() {
		System.out.println(
			"El enemigo ha lanzado un misil. Prepárate para esquivarlo!");
	}
	
	@Override
	public String getDescripcionAtaque() {
		return "Un ataque con un misil que inflige un gran daño en una zona amplia.";
	}
}
