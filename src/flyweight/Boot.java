package flyweight;

public class Boot {

	public static void main(String[] args) {

		FlyWeightCarFactory flyWeightCarFactory = new FlyWeightCarFactory();
		
		Car car1 = new Car("hatch", "icon-car-1");
		
		Context context1 = new Context("001010", "0100101", car1);
		
		Client client1 = new Client(context1, "Cristian");
		
		Car car2 = new Car("hatch", "icon-car-1");
		
		Car car3 = new Car("hatch", "icon-car-2");
		
		Car car4 = new Car("hatch", "icon-car-2");
		
		flyWeightCarFactory.addCarType(car1);
		
		flyWeightCarFactory.addCarType(car1);
		
		flyWeightCarFactory.addCarType(car2);
		
		flyWeightCarFactory.addCarType(car3);
		
		flyWeightCarFactory.addCarType(car4);
		
		flyWeightCarFactory.addCarType(car4);

	}

}
