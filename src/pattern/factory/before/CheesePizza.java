package pattern.factory.before;

public class CheesePizza extends Pizza {

	private static final String TYPE = "Cheese";
	
	{
		this.setName(TYPE);
	}
}
