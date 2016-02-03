package pattern.factory.after.ex3.store;

import pattern.factory.after.ex3.pizzas.Pizza;

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
