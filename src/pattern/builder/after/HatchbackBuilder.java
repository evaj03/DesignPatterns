package pattern.builder.after;

import pattern.builder.after.Car.DriveType;
import pattern.builder.after.Car.FuelType;
import pattern.builder.after.Car.GearType;

public class HatchbackBuilder extends CarBuilder {
    @Override
    public void addSeats( ) {
	car.setSeats( 5 );
    }
    
    @Override
    public void applyTypes( ) {
	car.setDrive( DriveType.REAR );
	car.setFuel( FuelType.PETROL );
	car.setGearType( GearType.MANUAL );
    }
    
    @Override
    public void setNavigation( ) {
	car.setHasGPS( false );
    }
}
