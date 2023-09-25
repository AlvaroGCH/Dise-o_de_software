package observer;

public class test {

	public static void main(String[] args) {
		Libro libro1 = new Libro();
		libro1.setTitulo("Mi libro 1");
		libro1.setEstado(false);
		
		Libro libro2 = new Libro();
		libro2.setTitulo("Mi libro 2");
		libro2.setEstado(true);
		
		Libro libro3 = new Libro();
		libro3.setTitulo("Mi libro 3");
		libro3.setEstado(false);
		
		Stock stock = new Stock(libro1);
		stock.actualiza();
		stock = new Stock(libro2);
		stock.actualiza();
		stock = new Stock(libro3);
		stock.actualiza();
	}

}
