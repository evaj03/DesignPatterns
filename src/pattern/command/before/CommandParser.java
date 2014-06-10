package pattern.command.before;

import java.util.Collection;

import pattern.command.commands.ICommand;
import pattern.command.commands.ICommandFactory;
import pattern.command.commands.NotFoundCommand;

public class CommandParser {
    final Collection< ICommandFactory > availableCommands;

    public CommandParser( Collection< ICommandFactory > availableCommands ) {
        this.availableCommands = availableCommands;
    }

    protected ICommand parseCommand( String[ ] args ) {
        String requestedCommandName = args[ 0 ];

        ICommandFactory command = findRequestedCommand( requestedCommandName );
        
        if ( null == command ) {
            NotFoundCommand notFound = new NotFoundCommand( );
            notFound.setName( requestedCommandName );
        }

        return command.makeCommand( args );
    }

    ICommandFactory findRequestedCommand( String commandName ) {
	for ( ICommandFactory command : availableCommands ) {
	    if ( command.getCommandName( ).equals( commandName ) ) {
		return command;
	    }
	}
	
	return null;
    }
}
