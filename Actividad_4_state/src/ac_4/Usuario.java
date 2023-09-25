package ac_4;

public class Usuario {

	public static void main(String[] args) {
		
		Semaforo semaforo = new Semaforo();
		semaforo.cartel();
		semaforo.setEstado(new Rojo());
		semaforo.cartel();
		semaforo.setEstado(new Ambar());
		semaforo.cartel();
		semaforo.setEstado(new Verde());
		semaforo.cartel();
	}
}
