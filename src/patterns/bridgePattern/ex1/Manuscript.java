package patterns.bridgePattern.ex1;

public abstract class Manuscript {
    protected final IFormatter formatter;
    private String author;
    
    public Manuscript( IFormatter formatter ) {
        this.formatter = formatter;
    }
    
    public abstract void print( );

    public String getAuthor( ) {
	return author;
    }

    public void setAuthor( String author ) {
	this.author = author;
    }
}