package pattern.factory.after.ex2;

public abstract class PizzaStore {
	
	public Pizza orderPizza(final String type) {		
		Pizza pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	
	protected abstract Pizza createPizza(final String type);
}
