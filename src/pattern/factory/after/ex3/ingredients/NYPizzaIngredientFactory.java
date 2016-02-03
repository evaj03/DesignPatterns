package pattern.factory.after.ex3.ingredients;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPereroni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClams() {
		return new FreshClams();
	}

	@Override
	public Veggies[] createGreek() {
		Veggies veggies[] = { new Garlic(), new Onion(), new BlackOlives(), new RedPepper() };
		return veggies;
	}
}
