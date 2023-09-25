package prueba;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		int i = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elige medio de transporte: 1.Jet 2.Helicoptero 3.Zepelin");
		i = sc.nextInt();
		
		if(i == 1) {
			c.setVuelo(new Jet());
		}
		else if(i == 2) {
			c.setVuelo(new Helicoptero());
		}
		else if(i == 3) {
			c.setVuelo(new Zepelin());
		}
		else{
			System.out.println("Error en la selección.");
		}

		c.tipoVuelo();
		c.imprimirFactura();

		sc.close();
	}

}
