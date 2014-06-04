package patterns.bridgePattern.ex1;

import java.util.Locale;

public class UpperCaseFormatter implements IFormatter {
    
    @Override
    public String format( String key, String value ) {
	return String.format( "%s: %s", key, value.toUpperCase( Locale.getDefault( ) ) );
    }
}
