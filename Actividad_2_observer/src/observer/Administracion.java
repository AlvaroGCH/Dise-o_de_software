package observer;

public class Administracion implements Observador{
	protected Libro libro;
	protected String texto;
	
	public Administracion(Libro libro) {
		this.libro = libro;
		libro.agrega(this);
	}
	
	public void actualiza() {
		texto = "Titulo: " + libro.getTitulo() + ", Estado: " + libro.getEstado();
		System.out.println(texto);
	}
}
