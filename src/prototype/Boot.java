package prototype;
import java.util.HashMap;

public class Boot {

	public static void main(String []args) {
		
		HashMap<String, Employee> employeePrototype = new HashMap<>();
		
		employeePrototype.put("intern", new Intern());
		employeePrototype.put("supervisor", new Supervisor());
		employeePrototype.put("bolsista", new Bolsista());
		
		employeePrototype.get("intern").clone();
		Employee employee = employeePrototype.get("supervisor").clone();		
		System.out.println("--------------------");
		
		Employee bolsista = employeePrototype.get("bolsista").clone();
	}
}
