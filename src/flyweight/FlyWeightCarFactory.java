package flyweight;

import java.util.HashMap;


public class FlyWeightCarFactory {

	HashMap<String, Car> flyWeightCar = new HashMap<>();
	
	public FlyWeightCarFactory() {}

	public void addCarType(Car car){
		Car carExists = flyWeightCar.get(car.getType());
		if(carExists != null && (carExists.getIcon() == car.getIcon())) {
			System.out.println("Car "+ carExists.getType() + ":" + carExists.getIcon() +" already exists in HashMap");
			return;
		}
		flyWeightCar.put(car.getType(), car);
		System.out.println("Car "+ car.getType() + ":" + car.getIcon() + " added to HashMap");
	}
}
