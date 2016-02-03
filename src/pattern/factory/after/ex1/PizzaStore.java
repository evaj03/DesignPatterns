package pattern.factory.after.ex1;

public class PizzaStore {
	private SimplePizzaFactory factory;
	
	
	public PizzaStore(final SimplePizzaFactory factory) {
		this.factory = factory;
	}


	public Pizza orderPizza(final String type) {		
		Pizza pizza = factory.createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
}
