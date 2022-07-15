package prototype;

public class Bolsista implements Employee{

	public Bolsista() {}
	
	public Bolsista clone() {
		System.out.println("Boslista created");
		return new Bolsista();
	}
}
