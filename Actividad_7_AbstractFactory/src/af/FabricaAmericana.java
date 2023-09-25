package af;

public class FabricaAmericana implements FabricaJuguete{

	public Lego creaLego(String pieza, String ficha, String accesorio, String sensor) {
		return new LegoAmericano(pieza, ficha, accesorio, sensor);
	}
	public Playmobil creaPlaymobil(String pieza, String ficha, String accesorio) {
		return new PlaymobilAmericano(pieza, ficha, accesorio);
	}
	public Monopoly creaMonopoly(String pieza, String ficha) {
		return new MonopolyAmericano(pieza, ficha);
	}

}
