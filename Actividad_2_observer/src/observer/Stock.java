package observer;

public class Stock implements Observador{

	protected Libro libro;
	protected String texto;
	
	public Stock(Libro libro) {
		this.libro = libro;
		libro.agrega(this);
	}
	
	public void actualiza() {
		texto = "Titulo: " + libro.getTitulo() + ", Estado: " + libro.getEstado();
		System.out.println(texto);
	}

}
