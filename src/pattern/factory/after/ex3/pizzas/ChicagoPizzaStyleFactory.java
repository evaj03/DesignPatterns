package pattern.factory.after.ex3.pizzas;

public class ChicagoPizzaStyleFactory extends PizzaStyleFactory {

	@Override
	public void cutPizza() {
		System.out.println("Cutting pizza into squares");
	}
	
}
