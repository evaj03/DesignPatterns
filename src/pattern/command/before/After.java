package pattern.command.before;

import java.util.ArrayList;
import java.util.Collection;
import pattern.command.commands.ICommand;
import pattern.command.commands.ICommandFactory;
import pattern.command.commands.createOrderCommand;
import pattern.command.commands.shipOrderCommand;
import pattern.command.commands.UpdateOrderCommand;

public class After {
    public static void run( String[ ] args ) {
	Collection< ICommandFactory > availableCommands = getAvailableCommands( );

        if ( args.length == 0 ) {
            printUsage( availableCommands );
            return;
        }

        CommandParser parser  = new CommandParser( availableCommands );
        ICommand      command = parser.parseCommand( args );

        command.execute( );
    }

    
    static Collection< ICommandFactory > getAvailableCommands( ) {
	Collection< ICommandFactory > allCommands = new ArrayList< ICommandFactory >( );
	
        allCommands.add( new createOrderCommand( ) );
        allCommands.add( new UpdateOrderCommand( ) );
        allCommands.add( new shipOrderCommand( ) );
        
        return allCommands;
    }

    
    private static void printUsage( Collection< ICommandFactory > availableCommands ) {
        System.out.println( "Usage: LoggingDemo CommandName Arguments" );
        System.out.println( "Commands:" );

        for ( ICommandFactory command : availableCommands ) {
            System.out.println( "  " + command.getDescription( ) );
        }
    }
}
