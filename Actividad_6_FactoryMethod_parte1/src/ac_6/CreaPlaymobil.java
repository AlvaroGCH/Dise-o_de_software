package ac_6;

public class CreaPlaymobil extends FabricaJuguetes{
    public Juguete creaJuguete(){
        return new PedidoPlaymobil();
    }
}
