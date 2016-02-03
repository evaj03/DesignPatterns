package pattern.factory.after.ex3.store;

import pattern.factory.after.ex3.ingredients.NYPizzaIngredientFactory;
import pattern.factory.after.ex3.ingredients.PizzaIngredientFactory;
import pattern.factory.after.ex3.pizzas.CheesePizza;
import pattern.factory.after.ex3.pizzas.ClamPizza;
import pattern.factory.after.ex3.pizzas.GreekPizza;
import pattern.factory.after.ex3.pizzas.NYPizzaStyleFactory;
import pattern.factory.after.ex3.pizzas.PepperoniPizza;
import pattern.factory.after.ex3.pizzas.Pizza;
import pattern.factory.after.ex3.pizzas.PizzaStyleFactory;
import pattern.factory.after.ex3.pizzas.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(final String type) {
		Pizza                  pizza             = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		PizzaStyleFactory      styleFactory      = new NYPizzaStyleFactory();

		if (type.equals("Cheese")) {
			pizza = new CheesePizza(ingredientFactory, styleFactory);
			pizza.setName("New York Style Cheese Pizza");
		} else if (type.equals("Greek")) {
			pizza = new GreekPizza(ingredientFactory, styleFactory);
			pizza.setName("New York Style Greek Pizza");
		} else if (type.equals("Pepperoni")) {
			pizza = new PepperoniPizza(ingredientFactory, styleFactory);
			pizza.setName("New York Style Pepperoni Pizza");
		} else if (type.equals("Clam")) {
			pizza = new ClamPizza(ingredientFactory, styleFactory);
			pizza.setName("New York Style Clam Pizza");
		} else if (type.equals("Veggie")) {
			pizza = new VeggiePizza(ingredientFactory, styleFactory);
			pizza.setName("New York Style Veggie Pizza");
		} 

		return pizza;
	}
}
