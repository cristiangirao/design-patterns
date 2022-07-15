package prototype;

public class EmployeePrototype {

	public EmployeePrototype() {}
	
	
	public Employee create(String employeeType) {
		if("intern".equalsIgnoreCase(employeeType)) {
			return new Intern();
		}else if("supervisor".equalsIgnoreCase(employeeType)) {
			return new Supervisor();
		}else if("bolsista".equalsIgnoreCase(employeeType)) {
			return new Bolsista();
		}
		return null;
	}
	
}
