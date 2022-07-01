package prototype;
import java.util.HashMap;

public class Boot {

	public static void main(String []args) {
		
		HashMap<String, Employee> employeePrototype = new HashMap<>();
		
		employeePrototype.put("intern", new Intern());
		employeePrototype.put("supervisor", new Supervisor());
		
		employeePrototype.get("intern").clone();
		
		employeePrototype.get("supervisor").clone();
	}
}
