package ac_4;

public class Semaforo {
	
	EstadoSemaforo estadoSemaforo;

	public Semaforo() {
		estadoSemaforo = new Verde();
	}

	public void setEstado(EstadoSemaforo estadoSemaforo) {
		this.estadoSemaforo = estadoSemaforo;
	}

	public void cartel() {
		estadoSemaforo.cartel();
	}
}
