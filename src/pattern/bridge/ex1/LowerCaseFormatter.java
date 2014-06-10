package pattern.bridge.ex1;

import java.util.Locale;

public class LowerCaseFormatter implements IFormatter {
    
    @Override
    public String format( String key, String value ) {
	return String.format( "%s: %s", key, value.toLowerCase( Locale.getDefault( ) ) );
    }
}
