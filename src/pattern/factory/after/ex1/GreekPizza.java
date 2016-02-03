package pattern.factory.after.ex1;

public class GreekPizza extends Pizza {

	private static final String TYPE = "Greek";
	
	{
		this.setName(TYPE);
	}
}
