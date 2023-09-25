package ad;

public class Main {
    public static void main(String[] args) {
        MotorComun comun = new MotorComun();
        MotorElectricoAdapter electrico = new MotorElectricoAdapter();

        // Motor Común

        comun.encender();
        comun.acelerar();
        comun.apagar();

        System.out.println();
        
        // Motor Eléctrico

        electrico.encender();
        electrico.acelerar();
        electrico.apagar();
    }
}
