package patterns.bridgePattern.ex1;

import java.util.HashMap;
import java.util.Map;

public class FAQ extends Manuscript {
    private String                title;
    private Map< String, String > questions = new HashMap< String, String >( );

    public FAQ( IFormatter formatter ) {
	super( formatter );
    }


    public String getTitle( ) {
        return this.title;
    }


    public void setTitle( String title ) {
        this.title = title;
    }

    
    public String getQuestion( String key ) {
	return questions.get( key );
    }
    
    
    public void addQuestion( String key, String value ) {
	questions.put( key, value );
    }

    @Override
    public void print( ) {
	System.out.println( formatter.format( "Title", title ) );

	for ( Map.Entry< String, String > question : questions.entrySet( ) ) {
	    System.out.println( formatter.format("   Question", question.getKey( ) ) );
	    System.out.println( formatter.format("   Answer",   question.getValue( ) ) );
	}

	System.out.println( );
    }
}
