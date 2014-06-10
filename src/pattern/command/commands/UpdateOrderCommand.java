package pattern.command.commands;

public class UpdateOrderCommand implements ICommand, ICommandFactory {
    private String commandName = "UpdateQuantity";
    private String description = null;
    private int    newQuantity;
    
    @Override
    public void setCommandName( String commandName ) {
	this.commandName = commandName;
    }

    @Override
    public String getCommandName( ) {
	return this.commandName;
    }

    @Override
    public void setDescription( String description ) {
	this.description = description;
    }

    @Override
    public String getDescription( ) {
	return this.description;
    }
    

    public void setNewQuantity( int newQuantity ) {
	this.newQuantity = newQuantity;
    }

    
    public int getNewQuatity( ) {
	return this.newQuantity;
    }

    @Override
    public ICommand makeCommand( String[ ] arguments ) {
	UpdateOrderCommand updateOrderCommand = new UpdateOrderCommand( ); 
	
	updateOrderCommand.setNewQuantity( Integer.parseInt( arguments[ 1 ] ) );
	
	return updateOrderCommand;
    }

    @Override
    public void execute( ) {
	//simulate updating a database
        final int oldQuantity = 5;
        
        System.out.println( "DATABASE: Updated" );

        // simulate logging
        System.out.format( "LOG: Updated order quantity from %d to %d%n", oldQuantity, newQuantity );
    }
}
