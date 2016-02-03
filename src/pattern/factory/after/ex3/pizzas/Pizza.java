package pattern.factory.after.ex3.pizzas;

import pattern.factory.after.ex3.ingredients.Cheese;
import pattern.factory.after.ex3.ingredients.Clams;
import pattern.factory.after.ex3.ingredients.Dough;
import pattern.factory.after.ex3.ingredients.Pepperoni;
import pattern.factory.after.ex3.ingredients.Sauce;
import pattern.factory.after.ex3.ingredients.Veggies;

public abstract class Pizza {
	 
	protected String    name;
	protected Dough     dough;
	protected Sauce     sauce;
	protected Veggies[] veggies;
	protected Cheese    cheese;
	protected Pepperoni pepperoni;
	protected Clams     clam;
	
	
	public abstract void prepare();
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	public void bake() {
		System.out.println("Baking for 25 mins at 350");
	}
	
	
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
}
