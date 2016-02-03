package pattern.factory.after.ex2;

public class ChicagoStylePepperoniPizza extends Pizza {

	private static final String TYPE = "Chicago Style Pepperoni";
	
	{
		this.setName(TYPE);
	}
	
	
	@Override
	public void cut() {
		System.out.println("Cutting " + TYPE + " into squares");
	}
}
