package pattern.factory.before;

public class PizzaOrderApp {

	public static void main(String[] args) {
		OrderPizza orderPizza     = new OrderPizza();
		Pizza      cheesePizza    = new Pizza();
		Pizza      greekPizza     = new Pizza();
		Pizza      pepperoniPizza = new Pizza();
		
		cheesePizza    = orderPizza.orderPizza("Cheese");
		greekPizza     = orderPizza.orderPizza("Greek");
		pepperoniPizza = orderPizza.orderPizza("Pepperoni");
	}
}
