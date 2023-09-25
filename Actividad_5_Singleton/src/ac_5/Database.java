package ac_5;
public final class Database {
    private int record;
    private String name;
    private static Database instancia;

    private Database(String n){
        name = n;
        record = 0;
    }

    public static Database instance(String n){
        if(instancia == null){
            instancia = new Database(n);
        }
        return instancia;
    }

    public void editRecord(String operation){
        System.out.println("Performing a "+ operation + " operation on record " + record + " in database "+ name);
    }

    public String getName(){
        return name;
    }
}