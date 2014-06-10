package pattern.command.commands;

public class shipOrderCommand implements ICommand, ICommandFactory {
    private String commandName = "ShipOrder";
    private String description = null;
    
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

    @Override
    public ICommand makeCommand( String[ ] arguments ) {
	throw new UnsupportedOperationException( );
    }

    @Override
    public void execute( ) {
	throw new UnsupportedOperationException( );
    }

}
