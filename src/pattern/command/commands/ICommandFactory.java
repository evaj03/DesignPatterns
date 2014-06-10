package pattern.command.commands;

public interface ICommandFactory {

    public void setCommandName( String commandName );
    public String getCommandName( );
    
    public void setDescription( String description );
    public String getDescription( );
    
    public ICommand makeCommand( String[ ] arguments );
}
