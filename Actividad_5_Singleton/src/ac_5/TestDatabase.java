package ac_5;
public class TestDatabase {
    public static void main(String args[]){
		Database database = Database.instance("Cuentas");
		
		database.getName();
		database.editRecord("operation1");
    }
}