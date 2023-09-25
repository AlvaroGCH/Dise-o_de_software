package af;

public class Usuario {
	public static void main(String[] args) {
		
		// Europeo
		FabricaJuguete fabrica = new FabricaEuropea();
		
		fabrica.creaLego("25", "Belgica", "Sombrero", "Ruido").mostrarDatos();
		fabrica.creaPlaymobil("3", "Francia", "Ropa").mostrarDatos();
		fabrica.creaMonopoly("10", "Austria").mostrarDatos();
		
		// Americana
		fabrica = new FabricaAmericana();
		
		fabrica.creaLego("25", "Canada", "Sombrero", "Ruido").mostrarDatos();
		fabrica.creaPlaymobil("3", "Mexico", "Ropa").mostrarDatos();
		fabrica.creaMonopoly("10", "EEUU").mostrarDatos();

	}

}
