package pattern.builder.before;

import pattern.builder.before.Car.DriveType;
import pattern.builder.before.Car.FuelType;
import pattern.builder.before.Car.GearType;

public class builderPattern {

    public static void main( String[ ] args ) {
	Car car = new Car( 5, true, 2.0, FuelType.PETROL, GearType.MANUAL, DriveType.FOURWD );
	
	System.out.println( car.toString( ) );
    }
}
