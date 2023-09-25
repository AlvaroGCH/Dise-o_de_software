package ac_6;
public class Usuario {
	public static void main(String[] args) {
		
		FabricaJuguetes cliente = new FabricaJuguetes();
		Juguete juguete;

		juguete = cliente.creaJuguete(1);
		System.out.println(juguete.getDescription());
		juguete = cliente.creaJuguete(2);
		System.out.println(juguete.getDescription());
		juguete = cliente.creaJuguete(3);
		System.out.println(juguete.getDescription());
		juguete = cliente.creaJuguete(4);
		System.out.println(juguete.getDescription());
	}
}