package pattern.chainofcommand.approvalCommon;

import java.math.BigDecimal;
import java.util.Scanner;

public class ConsoleInput {
    public static boolean tryReadDecimal( String prompt, BigDecimal[] value ) {
	value[ 0 ] = BigDecimal.ZERO;
	
        Scanner scanner = new Scanner( System.in );
	
	scanner.useDelimiter( "\r\n" );
	
	// Console loop
        boolean hasInput = true;
        
	while ( hasInput ) {
	    System.out.println( prompt );
	    
	    String input = scanner.next( );
	    
	    if ( input == null || input.isEmpty( ) ) {
		System.out.println( "Closing input." );
		scanner.close( );
		hasInput = false;
	    }
	    else {
		//System.out.println( "You entered: " + input );
		try {
        	    value[ 0 ] = BigDecimal.valueOf( Double.parseDouble( input ) );
                    return true;
                }
                catch ( NumberFormatException e ) {
            	    System.out.println( "The input is not a valid decimal." );
                }
	    }
	}
		
        return hasInput;    
    }
}
