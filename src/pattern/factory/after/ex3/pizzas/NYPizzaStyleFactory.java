package pattern.factory.after.ex3.pizzas;

public class NYPizzaStyleFactory extends PizzaStyleFactory {

	@Override
	public void cutPizza() {
		System.out.println("Cutting pizza into diagonal slices");
	}
	
}
