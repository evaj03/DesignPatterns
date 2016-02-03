package pattern.factory.after.ex2;

public class ChicagoStyleVeggiePizza extends Pizza {

	private static final String TYPE = "Chicago Style Veggie";
	
	{
		this.setName(TYPE);
	}
	
	
	@Override
	public void cut() {
		System.out.println("Cutting " + TYPE + " into squares");
	}
}
