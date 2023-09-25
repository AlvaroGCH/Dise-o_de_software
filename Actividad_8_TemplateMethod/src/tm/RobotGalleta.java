package tm;

public class RobotGalleta extends RobotTemplate{

	public void start() {
		System.out.println("Starting...");
	}
	
	public void getParts() {
		System.out.println("Obteniendo harina y azucar...");
	}
	
	public void assemble() {
		System.out.println("Consiguiendo harina y azucar...");
	}
	
	public void test() {
		System.out.println("Cocinando...");
	}
	
	public void stop() {
		System.out.println("Stopping...");
	}

}
