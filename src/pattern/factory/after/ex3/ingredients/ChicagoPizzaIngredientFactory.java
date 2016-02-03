package pattern.factory.after.ex3.ingredients;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
		@Override
		public Dough createDough() {
			return new ThickCrustDough();
		}

		@Override
		public Sauce createSauce() {
			return new PlumTomatoSauce();
		}

		@Override
		public Cheese createCheese() {
			return new MozzarellaCheese();
		}

		@Override
		public Veggies[] createVeggies() {
			Veggies veggies[] = { new BlackOlives(), new Spinach(), new EggPlant() };
			return veggies;
		}

		@Override
		public Pepperoni createPereroni() {
			return new SlicedPepperoni();
		}

		@Override
		public Clams createClams() {
			return new FrozenClams();
		}
		
		@Override
		public Veggies[] createGreek() {
			Veggies veggies[] = { new BlackOlives(), new RedOnion(), new Garlic() };
			return veggies;
		}
}
