package pattern.bridge.ex1;

public class Thesis extends Manuscript {
    private String title;
    
    public Thesis( IFormatter formatter ) {
	super( formatter );
    }


    public String getTitle( ) {
	return title;
    }


    public void setTitle( String title ) {
	this.title = title;
    }


    @Override
    public void print( ) {
	System.out.println( formatter.format( "Author", super.getAuthor( ) ) );
	System.out.println( formatter.format( "Title", title ) );

	System.out.println( );
    }
}
