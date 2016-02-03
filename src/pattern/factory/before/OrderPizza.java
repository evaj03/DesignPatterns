package pattern.factory.before;

public class OrderPizza {

	public Pizza orderPizza(final String type) {
		Pizza pizza = new Pizza();
		
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
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
}
