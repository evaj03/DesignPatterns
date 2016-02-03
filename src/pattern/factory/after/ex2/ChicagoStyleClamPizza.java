package pattern.factory.after.ex2;

public class ChicagoStyleClamPizza extends Pizza {

	private static final String TYPE = "Chicago Style Clam";
	
	{
		this.setName(TYPE);
	}
	
	
	@Override
	public void cut() {
		System.out.println("Cutting " + TYPE + " into squares");
	}
}
