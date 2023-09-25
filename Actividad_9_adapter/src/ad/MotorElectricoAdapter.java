package ad;

public class MotorElectricoAdapter extends Motor{
    MotorElectrico electrico;

    public MotorElectricoAdapter(){
        super();
        electrico = new MotorElectrico();     
    }

    public void encender(){
        this.electrico.conectar();
    }

    public void acelerar(){
        this.electrico.moverMasRapido();
    }

    public void apagar(){
        this.electrico.detener();
        this.electrico.desconectar();
    }
}
