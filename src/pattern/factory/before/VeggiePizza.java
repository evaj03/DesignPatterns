package pattern.factory.before;

public class VeggiePizza extends Pizza {

	private static final String TYPE = "Veggie";
	
	{
		this.setName(TYPE);
	}
}
