package pattern.factory.after.ex2;

public class ChicagoStyleCheesePizza extends Pizza {

	private static final String TYPE = "Chicago Style Cheese";
	
	{
		this.setName(TYPE);
	}
	
	
	@Override
	public void cut() {
		System.out.println("Cutting " + TYPE + " into squares");
	}
}
