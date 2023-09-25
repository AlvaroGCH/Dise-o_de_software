package af;

public interface FabricaJuguete {
	public Lego creaLego(String pieza, String ficha, String accesorio, String sensor);
	public Playmobil creaPlaymobil(String pieza, String ficha, String accesorio);
	public Monopoly creaMonopoly(String pieza, String ficha);
}
