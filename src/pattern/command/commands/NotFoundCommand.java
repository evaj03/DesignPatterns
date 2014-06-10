package pattern.command.commands;

public class NotFoundCommand implements ICommand {
    private String name;
    
    public void setName( String name ) {
	this.name = name;
    }
    
    public String getName( ) {
	return this.name;
    }
    
    @Override
    public void execute( ) {
	System.out.println( "Couldn't find command: " + name );
    }

}
