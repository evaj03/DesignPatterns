package pattern.builder.after;

public class builderPattern {

    public static void main( String[ ] args ) {
	CarMaker carMaker = new CarMaker( new PeopleCarrierBuilder( ) );
	carMaker.buildCar( );
	Car peopleCarrier = carMaker.getCar( );
	
	System.out.println( peopleCarrier.toString( ) );
	
	carMaker = new CarMaker( new HatchbackBuilder( ) );
	carMaker.buildCar( );
	Car hatchback = carMaker.getCar( );
	
	System.out.println( hatchback.toString( ) );
    }
}
