package tm;

public class RobotAutomovil extends RobotTemplate{

	public void start() {
		System.out.println("Starting...");
	}
	
	public void getParts() {
		System.out.println("Getting a carburetor...");
	}
	
	public void assemble() {
		System.out.println("Installing the carburetor...");
	}
	
	public void test() {
		System.out.println("Reviving the engine...");
	}
	
	public void stop() {
		System.out.println("Stopping...");
	}

}
