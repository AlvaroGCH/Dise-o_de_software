package tm;

public class TestRobot {

	public static void main(String[] args) {
		RobotTemplate robot = new RobotAutomovil();
		robot.go();
		robot = new RobotGalleta();
		robot.go();
	}

}
