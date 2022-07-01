package prototype;

public class Intern implements Employee{

	public Intern() {
		
	}

	public Intern clone() {
		System.out.println("Intern object created");
		return new Intern();
	}
}
