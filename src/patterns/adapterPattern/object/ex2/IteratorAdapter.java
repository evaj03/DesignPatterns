package patterns.adapterPattern.object.ex2;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdapter implements Enumeration< String > {

    Iterator< String > iterator;
    
    public IteratorAdapter( Iterator< String > iterator ) {
	this.iterator = iterator;
    }
    
    @Override
    public boolean hasMoreElements( ) {
	return this.iterator.hasNext( );
    }

    @Override
    public String nextElement( ) {
	return this.iterator.next( );
    }

}
