package ac_6;

public class CreaLego extends FabricaJuguetes{
    public Juguete creaJuguete(){
        return new PedidoLego();
    }
}
