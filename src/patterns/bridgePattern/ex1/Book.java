package patterns.bridgePattern.ex1;

public class Book extends Manuscript {
    private String title;
    private String author;
    private String text;
    
    public Book( IFormatter formatter ) {
	super( formatter );
    }
    

    public String getTitle( ) {
        return this.title;
    }

    
    public void setTitle( String title ) {
        this.title = title;
    }

    
    public String getAuthor( ) {
        return this.author;
    }

    
    public void setAuthor( String author ) {
        this.author = author;
    }


    public String getText( ) {
        return this.text;
    }


    public void setText( String text ) {
        this.text = text;
    }


    @Override
    public void print( ) {
        System.out.println( formatter.format( "Title", title ) );
        System.out.println( formatter.format( "Author", author ) );
        System.out.println( formatter.format( "Text", text ) );
        System.out.println( );
    }

}