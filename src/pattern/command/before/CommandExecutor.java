package pattern.command.before;

public class CommandExecutor {
    
    protected void executeCommand( String[ ] args ) {
        switch (args[0]) {
            case "UpdateQuantity":
                updateQuantity( Integer.parseInt( args[ 1 ] ) );
                break;
            case "CreateOrder":
                createOrder( );
                break;
            case "ShipOrder":
                shipOrder( );
                break;
            default:
                System.out.println( "Unrecognized command" );
                break;
        }
    }

    private void updateQuantity( int newQuantity ) {
        // simulate updating a database
        final int oldQuantity = 5;
        
        System.out.println( "DATABASE: Updated" );

        // simulate logging
        System.out.format( "LOG: Updated order quantity from %d to %d%n", oldQuantity, newQuantity );
    }

    void createOrder( ) {}
    void shipOrder( ) {}
}
