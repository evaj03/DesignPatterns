package pattern.builder.after;

import pattern.builder.after.Car.DriveType;
import pattern.builder.after.Car.FuelType;
import pattern.builder.after.Car.GearType;

public class PeopleCarrierBuilder extends CarBuilder {
    @Override
    public void addSeats( ) {
	car.setSeats( 7 );
    }
    
    @Override
    public void applyTypes( ) {
	car.setDrive( DriveType.FRONT );
	car.setFuel( FuelType.DIESEL );
	car.setGearType( GearType.AUTOMATIC );
    }
    
    @Override
    public void setNavigation( ) {
	car.setHasGPS( true );
    }
}
