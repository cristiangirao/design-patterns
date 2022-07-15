package flyweight;

public class Context {

	private String latitude;
	private String longitude;
	
	private Car car;
	
	public Context() {}
	
	public Context(String latitude, String longitude, Car car) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.car = car;
	}
	
	public String getLatitude() {
		return this.latitude;
	}

	public String getLongitde() {
		return this.longitude;
	}
	
	public Car getCar() {
		return this.car;
	}
	
}
