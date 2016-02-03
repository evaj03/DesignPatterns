package pattern.factory.after.ex2;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(final String type) {

		if (type.equals("Cheese")) {
			return new NYStyleCheesePizza();
		} else if (type.equals("Greek")) {
			return new NYStyleGreekPizza();
		} else if (type.equals("Pepperoni")) {
			return new NYStylePepperoniPizza();
		} else if (type.equals("Clam")) {
			return new NYStyleClamPizza();
		} else if (type.equals("Veggie")) {
			return new NYStyleVeggiePizza();
		} else {
			return null;
		}
	}

}
