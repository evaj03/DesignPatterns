package pattern.adapter.object.ex1;

public class ObjectAdapterPattern {

    public static void main( String[ ] args ) {
	
	System.out.println( "The Mallard Duck says..." );
	Duck mallard = new Mallard( );
	
	mallard.quack( );
	mallard.fly( );
	
	System.out.println( );
	System.out.println( "The Wild Turkey says..." );
	Turkey turkey = new WildTurkey( );
	
	turkey.gobble( );
	turkey.fly( );
	
	System.out.println( );
	System.out.println( "The Turkey pretending to be a duck says..." );
	Duck turkeyAdaptor = new TurkeyAdapter( turkey );
	
	turkeyAdaptor.quack( );
	turkeyAdaptor.fly( );
	
	System.out.println( );
	System.out.println( "The Duck pretending to be a turkey says..." );
	Turkey duckAdaptor = new DuckAdapter( mallard );
	
	duckAdaptor.gobble( );
	duckAdaptor.fly( );
    }

}
