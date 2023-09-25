package ac_6;

public class CreaMonopoly extends FabricaJuguetes{
    public Juguete creaJuguete(){
        return new PedidoMonopoly();
    }
}
