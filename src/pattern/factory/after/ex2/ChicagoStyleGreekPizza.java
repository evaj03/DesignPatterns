package pattern.factory.after.ex2;

public class ChicagoStyleGreekPizza extends Pizza {

	private static final String TYPE = "Chicago Style Greek";
	
	{
		this.setName(TYPE);
	}
	
	
	@Override
	public void cut() {
		System.out.println("Cutting " + TYPE + " into squares");
	}
}
