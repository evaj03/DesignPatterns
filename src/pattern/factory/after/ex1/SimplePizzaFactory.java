package pattern.factory.after.ex1;

public class SimplePizzaFactory {

	public Pizza createPizza(final String type) {
		Pizza pizza = null;
		
		if (type.equals("Cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("Greek")) {
			pizza = new GreekPizza();
		} else if (type.equals("Pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("Clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("Veggie")) {
			pizza = new VeggiePizza();
		}
		
		return pizza;
	}
}
