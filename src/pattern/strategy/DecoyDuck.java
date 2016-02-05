package pattern.strategy;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyBehaviour(new FlyNoWay());
		setQuackBehaviour(new MuteQuack());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
