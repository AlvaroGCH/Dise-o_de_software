package observer;

public class Compras implements Observador{
	protected Libro libro;
	protected String texto;
	
	public Compras(Libro libro) {
		this.libro = libro;
		libro.agrega(this);
	}
	
	public void actualiza() {
		texto = "Titulo: " + libro.getTitulo() + ", Estado: " + libro.getEstado();
		System.out.println(texto);
	}
}
