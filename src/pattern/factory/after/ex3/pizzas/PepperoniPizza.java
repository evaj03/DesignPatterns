package pattern.factory.after.ex3.pizzas;

import pattern.factory.after.ex3.ingredients.PizzaIngredientFactory;

public class PepperoniPizza extends StylePizza {
	private PizzaIngredientFactory ingredientFactory;	
	private PizzaStyleFactory      styleFactory;
	
	public PepperoniPizza(final PizzaIngredientFactory ingredientFactory, final PizzaStyleFactory styleFactory) {
		this.ingredientFactory = ingredientFactory;
		this.styleFactory      = styleFactory;
	}
	
	
	@Override
	public void prepare() {
		System.out.println("Preparing " + this.getName());
		dough     = ingredientFactory.createDough();
		sauce     = ingredientFactory.createSauce();
		cheese    = ingredientFactory.createCheese();
		pepperoni = ingredientFactory.createPereroni();
	}
	
	
	@Override
	public void cut() {
		styleFactory.cutPizza();
	}
}
