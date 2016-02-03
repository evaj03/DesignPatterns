package pattern.factory.before;

public class PepperoniPizza extends Pizza {

	private static final String TYPE = "Pepperoni";
	
	{
		this.setName(TYPE);
	}
}
