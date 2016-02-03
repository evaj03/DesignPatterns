package pattern.factory.before;

public class ClamPizza extends Pizza {

	private static final String TYPE = "Clam";
	
	{
		this.setName(TYPE);
	}
}
