package af;

public class FabricaEuropea implements FabricaJuguete{

	public Lego creaLego(String pieza, String ficha, String accesorio, String sensor) {
		return new LegoEuropeo(pieza, ficha, accesorio, sensor);
	}
	public Playmobil creaPlaymobil(String pieza, String ficha, String accesorio) {
		return new PlaymobilEuropeo(pieza, ficha, accesorio);
	}
	public Monopoly creaMonopoly(String pieza, String ficha) {
		return new MonopolyEuropeo(pieza, ficha);
	}

}
