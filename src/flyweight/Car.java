package flyweight;

public class Car {

	private String icon;
	private String type;
	
	public Car() {}
	
	public Car(String type, String icon) {
		this.icon = icon;
		this.type = type;
	}
	
	public String drawCar() {
		return "Drawing a " + this.getType() + " object with " + this.getIcon() + "icon.";
	}
	
	public String getType()
	{
		return this.type;
	}
	
	public String getIcon()
	{
		return this.icon;
	}
}
