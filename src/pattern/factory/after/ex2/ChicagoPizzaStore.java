package pattern.factory.after.ex2;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(final String type) {

		if (type.equals("Cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if (type.equals("Greek")) {
			return new ChicagoStyleGreekPizza();
		} else if (type.equals("Pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		} else if (type.equals("Clam")) {
			return new ChicagoStyleClamPizza();
		} else if (type.equals("Veggie")) {
			return new ChicagoStyleVeggiePizza();
		} else {
			return null;
		}
	}

}
