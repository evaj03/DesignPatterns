package pattern.factory.after.ex3.ingredients;

public interface PizzaIngredientFactory {

	Dough     createDough();
	Sauce     createSauce();
	Cheese    createCheese();
	Veggies[] createVeggies();
	Pepperoni createPereroni();
	Clams     createClams();
	Veggies[] createGreek();
}
