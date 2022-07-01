package prototype;

public class Supervisor implements Employee{

	public Supervisor() {
		
	}
		
	public Supervisor clone() {
		System.out.println("Supervisor object created");
		return new Supervisor();
	}
}
