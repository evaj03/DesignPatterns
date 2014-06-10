package pattern.command.before;

public class Before {
    public static void run( String[ ] args ) {
	if ( args.length == 0 ) {
	    printUsage( );
	    return;
	}
	
        CommandExecutor processor = new CommandExecutor( );
        
        processor.executeCommand( args );
    }

    
    private static void printUsage( ) {
        System.out.println( "Usage: LoggingDemo CommandName Arguments" );
        System.out.println( "Commands:" );
        System.out.println( "   UpdateQuantity number" );
        System.out.println( "   CreateOrder" );
        System.out.println( "   ShipOrder" );
    }
}
