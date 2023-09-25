package observer;

public class Libro extends Sujeto{

	protected boolean malEstado;
	protected String titulo;
		
	public boolean getEstado() {
		return malEstado;
	}
	
	public void setEstado(boolean malEstado) {
		this.malEstado = malEstado;
		notifica();
	}
	
	public void devuelveLibro(boolean malEstado) {
		if(malEstado == true) {
			this.malEstado = malEstado;
			notifica();
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
		notifica();
	}

}
