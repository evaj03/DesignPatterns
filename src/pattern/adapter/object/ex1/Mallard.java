package pattern.adapter.object.ex1;

public class Mallard implements Duck {

    @Override
    public void quack( ) {
	System.out.println( "Quack" );
    }

    @Override
    public void fly( ) {
	System.out.println( "Flying duck" );
    }
    
}
