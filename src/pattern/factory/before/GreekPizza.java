package pattern.factory.before;

public class GreekPizza extends Pizza {

	private static final String TYPE = "Greek";
	
	{
		this.setName(TYPE);
	}
}
