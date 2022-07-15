package flyweight;

public class Client {

	private String name;
	private Context context;
	
	public Client(Context context, String name) {
		this.context = context;
		this.name = name;
	} 

	public Context getContext (){
		return this.context;
	}
	public String getName (){
		return this.name;
	}
}
