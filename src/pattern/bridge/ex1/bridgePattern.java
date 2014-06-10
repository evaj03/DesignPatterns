package pattern.bridge.ex1;

import java.util.ArrayList;
import java.util.List;

public class bridgePattern {

    public static void main( String[ ] args ) {
	// The abstraction...
	List< Manuscript > documents = new ArrayList< Manuscript >( );
	List< IFormatter > formats   = new ArrayList< IFormatter >( );
	
	formats.add( new StandardFormatter( ) );
	formats.add( new BackwardsFormatter( ) );
	formats.add( new LowerCaseFormatter( ) );
	formats.add( new UpperCaseFormatter( ) );
	
	for ( IFormatter formatter : formats ) {
	    createFAQ( documents, formatter );
	    createBook( documents, formatter );
	    createThesis( documents, formatter );
	}
        
        for ( Manuscript doc : documents ) {
            doc.print( );
        }
    }


    private static void createThesis( List< Manuscript > documents, IFormatter formatter ) {
	Thesis thesis = new Thesis( formatter );
	thesis.setAuthor( "Rob Roy" );
        thesis.setTitle( "Polymorphic Behaviour" );
        
        documents.add( thesis );
    }

    
    private static void createBook( List< Manuscript > documents, IFormatter formatter ) {
	Book book = new Book( formatter );
        book.setTitle( "Lots of Patterns" );
        book.setAuthor( "John Sonmez" );
        book.setText( "Blah blah blah..." );
        
        documents.add( book );
    }

    
    private static void createFAQ( List< Manuscript > documents, IFormatter formatter ) {
	FAQ faq = new FAQ( formatter );
        faq.setTitle( "The Bridge Pattern FAQ" );
        faq.addQuestion( "What is it?", "A design pattern" );
        faq.addQuestion( "When do we use it?", "When you need to separate an abstraction from an implementation." );
        
        documents.add(faq);
    }
}
