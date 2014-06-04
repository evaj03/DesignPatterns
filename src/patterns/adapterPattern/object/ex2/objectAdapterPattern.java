package patterns.adapterPattern.object.ex2;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class objectAdapterPattern {

    public static void main( String[ ] args ) {
	List< String >   monthList = new ArrayList< String >( );
	Vector< String > dayNames  = new Vector< String >( );
	
	populate( monthList );
	populate( dayNames );
	
	System.out.println( );
	System.out.println( "The Iterator pretending to be an Enumeration..." );
	Enumeration< String > iterAdapter = new IteratorAdapter( monthList.iterator( ) );
	
	while ( iterAdapter.hasMoreElements( ) ) {
	    System.out.println( "Element " + iterAdapter.nextElement( ) );
	}
	
	
	System.out.println( );
	System.out.println( "The Enumeration pretending to be an Iterator..." );
	Iterator< String > enumAdapter = new EnumerationAdapter( dayNames.elements( ) );
	
	while ( enumAdapter.hasNext( ) ) {
	    System.out.println( "Element " + enumAdapter.next( ) );
	}
    }

    
    private static void populate( List< String > months ) {
	months.add( "Jan" );
	months.add( "Feb" );
	months.add( "Mar" );
	months.add( "Apr" );
	months.add( "May" );
    }

}
