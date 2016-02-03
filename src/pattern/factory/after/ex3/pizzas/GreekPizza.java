package pattern.factory.after.ex3.pizzas;

import pattern.factory.after.ex3.ingredients.PizzaIngredientFactory;
import pattern.factory.after.ex3.ingredients.Veggies;

public class GreekPizza extends StylePizza {
	private PizzaIngredientFactory ingredientFactory;	
	private PizzaStyleFactory      styleFactory;
	
	public GreekPizza(final PizzaIngredientFactory ingredientFactory, final PizzaStyleFactory styleFactory) {
		this.ingredientFactory = ingredientFactory;
		this.styleFactory      = styleFactory;
	}
	
	
	@Override
	public void prepare() {
		System.out.println("Preparing " + this.getName());
		dough   = ingredientFactory.createDough();
		sauce   = ingredientFactory.createSauce();
		cheese  = ingredientFactory.createCheese();
		veggies = ingredientFactory.createGreek();
		
		for (Veggies v : veggies) {
			System.out.println("Adding vegetable " + v.getName());
		}
	}
	
	
	@Override
	public void cut() {
		styleFactory.cutPizza();
	}
}
