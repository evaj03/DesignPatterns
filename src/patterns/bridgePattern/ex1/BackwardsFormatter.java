package patterns.bridgePattern.ex1;

public class BackwardsFormatter implements IFormatter {
    @Override
    public String format( String key, String value ) {
	return String.format( "%s: %s", key, new StringBuffer( value ).reverse( ).toString( ) );
    }
}
