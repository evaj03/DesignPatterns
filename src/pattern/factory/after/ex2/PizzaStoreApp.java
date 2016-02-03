package pattern.factory.after.ex2;

public class PizzaStoreApp {

	public static void main(String[] args) {
		PizzaStoreApp app                   = new PizzaStoreApp();
		PizzaStore    chicagoPizzaStore     = new ChicagoPizzaStore();
		PizzaStore    californianPizzaStore = new CalifornianPizzaStore();
		PizzaStore    newYorkPizzaStore     = new NYPizzaStore();
		
		
		app.printPizza(chicagoPizzaStore.orderPizza("Cheese"));
		app.printPizza(chicagoPizzaStore.orderPizza("Greek"));
		app.printPizza(californianPizzaStore.orderPizza("Pepperoni"));
		app.printPizza(californianPizzaStore.orderPizza("Clam"));
		app.printPizza(newYorkPizzaStore.orderPizza("Veggie"));
		app.printPizza(newYorkPizzaStore.orderPizza("Pepperoni"));
	}
	
	
	public void printPizza(final Pizza pizza) {
		System.out.println("Ordered a " + pizza.getName() + " pizza.");
		
		System.out.println("Eating " + pizza.getName() + " pizza.");
		
		System.out.println("**************************************************");
	}
}
