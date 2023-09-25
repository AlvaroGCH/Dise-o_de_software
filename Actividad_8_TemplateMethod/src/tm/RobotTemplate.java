package tm;

public abstract class RobotTemplate {

	public final void go(){
		start();
		getParts();
		assemble();
		test();
		stop();
	}
	
	public abstract void start();
	
	public abstract void getParts();
	
	public abstract void assemble();
	
	public abstract void test();
	
	public abstract void stop();

}
