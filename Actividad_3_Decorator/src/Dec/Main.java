package Dec;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Recompensa recompensa = new Recompensa();
		Pegatina pega = new Pegatina(recompensa);
		WeeKid kid= new WeeKid(recompensa,"Un mundo sin límites");
		Banio bano = new Banio(recompensa);
		String yes = "y";
		String no = "n";
		System.out.println("¿ha ido al baño?: , y|n");
		String entrada = sc.nextLine();if(entrada.equals(yes)) {
		System.out.println("¿ha sido el niño de la semana?: , y|n");
		String entrada2 = sc.nextLine();
		if(entrada2.equals(yes)) {
			pega.mostrar();bano.mostrar();
			kid.mostrar();
			}else if(entrada2.equals(no)) {
				pega.mostrar();bano.mostrar();
				}
		}else if(entrada.equals(no)) 
		{System.out.println("¿ha sido el niño de la semana?: , y|n");
		String entrada2 = sc.nextLine();
		if(entrada2.equals(yes)) {pega.mostrar();kid.mostrar();
		}else if(entrada2.equals(no)) {pega.mostrar();}
		}
	}
}
