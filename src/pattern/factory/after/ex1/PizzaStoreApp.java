package pattern.factory.after.ex1;

public class PizzaStoreApp {

	public static void main(String[] args) {
		PizzaStoreApp      app          = new PizzaStoreApp();
		SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
		PizzaStore         orderPizza   = new PizzaStore(pizzaFactory);
		
		app.printPizza(orderPizza.orderPizza("Cheese"));
		app.printPizza(orderPizza.orderPizza("Greek"));
		app.printPizza(orderPizza.orderPizza("Pepperoni"));
		app.printPizza(orderPizza.orderPizza("Clam"));
		app.printPizza(orderPizza.orderPizza("Veggie"));
	}
	
	
	public void printPizza(final Pizza pizza) {
		System.out.println("Ordered a " + pizza.getName() + " pizza.");
		
		System.out.println("Eating " + pizza.getName() + " pizza.");
		
		System.out.println("**************************************************");
	}
}
