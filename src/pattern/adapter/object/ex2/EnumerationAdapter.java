package pattern.adapter.object.ex2;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationAdapter implements Iterator< String > {

    Enumeration< String > enumeration;
    
    public EnumerationAdapter( Enumeration< String > enumeration ) {
	this.enumeration = enumeration;
    }
    
    
    @Override
    public boolean hasNext( ) {
	return this.enumeration.hasMoreElements( );
    }

    @Override
    public String next( ) {
	return this.enumeration.nextElement( );
    }

    @Override
    public void remove( ) {
	throw new UnsupportedOperationException( );	
    }

}
