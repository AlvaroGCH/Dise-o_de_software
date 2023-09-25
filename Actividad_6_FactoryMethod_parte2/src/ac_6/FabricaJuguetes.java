package ac_6;
public class FabricaJuguetes {
	public static Juguete creaJuguete(int tipo){
		Juguete juguete = null; // por defecto

		if(tipo == Juguete.MONOPOLY){
			juguete = new PedidoMonopoly();
		}
		else if(tipo == Juguete.LEGO){
			juguete = new PedidoLego();
		}
		else if(tipo == Juguete.PLAYMOBIL){
			juguete = new PedidoPlaymobil();
		}
		else if(tipo == Juguete.SCALEXTRIC){
			juguete = new PedidoScalextric();
		}
		return juguete;
	}
}
