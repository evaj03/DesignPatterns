package pattern.command.before;

public class Command {

    public static void main( String[ ] args ) {
	
	String[ ] values = new String[ 2 ];
	
	values[ 0 ] = "UpdateQuantity";
	values[ 1 ] = "45";
	
	Before.run( values );
	
	After.run( values );
    }

}
