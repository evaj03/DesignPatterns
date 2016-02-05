package pattern.strategy;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		MallardDuck	mallard    = new MallardDuck();
		RubberDuck	rubberDuck = new RubberDuck();
		DecoyDuck	decoy      = new DecoyDuck();
 		ModelDuck	model      = new ModelDuck();

		mallard.performQuack();
		rubberDuck.performQuack();
		decoy.performQuack();
   
		model.performFly();	
		model.setFlyBehaviour(new FlyRocketPowered());
		model.performFly();
	}
}
