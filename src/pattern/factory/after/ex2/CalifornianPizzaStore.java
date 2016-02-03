package pattern.factory.after.ex2;

public class CalifornianPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(final String type) {

		if (type.equals("Cheese")) {
			return new CalifornianStyleCheesePizza();
		} else if (type.equals("Greek")) {
			return new CalifornianStyleGreekPizza();
		} else if (type.equals("Pepperoni")) {
			return new CalifornianStylePepperoniPizza();
		} else if (type.equals("Clam")) {
			return new CalifornianStyleClamPizza();
		} else if (type.equals("Veggie")) {
			return new CalifornianStyleVeggiePizza();
		} else {
			return null;
		}
	}

}
