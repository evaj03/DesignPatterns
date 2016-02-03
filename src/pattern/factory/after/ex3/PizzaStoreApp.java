package pattern.factory.after.ex3;

import pattern.factory.after.ex3.pizzas.Pizza;
import pattern.factory.after.ex3.store.ChicagoPizzaStore;
import pattern.factory.after.ex3.store.NYPizzaStore;
import pattern.factory.after.ex3.store.PizzaStore;

public class PizzaStoreApp {

	public static void main(String[] args) {
		PizzaStoreApp app               = new PizzaStoreApp();
		PizzaStore    chicagoPizzaStore = new ChicagoPizzaStore();
		PizzaStore    newYorkPizzaStore = new NYPizzaStore();
		
		app.printPizza(chicagoPizzaStore.orderPizza("Cheese"));
		app.printPizza(chicagoPizzaStore.orderPizza("Clam"));
		app.printPizza(chicagoPizzaStore.orderPizza("Greek"));
		app.printPizza(chicagoPizzaStore.orderPizza("Pepperoni"));
		app.printPizza(chicagoPizzaStore.orderPizza("Veggie"));
		
		app.printPizza(newYorkPizzaStore.orderPizza("Cheese"));
		app.printPizza(newYorkPizzaStore.orderPizza("Clam"));
		app.printPizza(newYorkPizzaStore.orderPizza("Greek"));
		app.printPizza(newYorkPizzaStore.orderPizza("Pepperoni"));
		app.printPizza(newYorkPizzaStore.orderPizza("Veggie"));
	}
	
	
	public void printPizza(final Pizza pizza) {
		System.out.println("Ordered a " + pizza.getName() + " pizza.");
		
		System.out.println("Eating " + pizza.getName() + " pizza.");
		
		System.out.println("**************************************************");
	}
}
