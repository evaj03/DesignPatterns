package pattern.factory.after.ex3.pizzas;

import pattern.factory.after.ex3.ingredients.PizzaIngredientFactory;

public class CheesePizza extends StylePizza {
	private PizzaIngredientFactory ingredientFactory;
	private PizzaStyleFactory      styleFactory;
	
	public CheesePizza(final PizzaIngredientFactory ingredientFactory, final PizzaStyleFactory styleFactory) {
		this.ingredientFactory = ingredientFactory;
		this.styleFactory      = styleFactory;
	}
	
	
	@Override
	public void prepare() {
		System.out.println("Preparing " + this.getName());
		dough  = ingredientFactory.createDough();
		sauce  = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
	
	
	@Override
	public void cut() {
		styleFactory.cutPizza();
	}
}
