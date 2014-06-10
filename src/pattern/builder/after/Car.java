package pattern.builder.after;

public class Car {
    private int       seats;
    private boolean   hasGPS;
    private double    engineSize;
    private FuelType  fuel;
    private GearType  gear;
    private DriveType drive;

    public enum FuelType  { PETROL, DIESEL };
    public enum GearType  { MANUAL, AUTOMATIC };
    public enum DriveType { FOURWD, FRONT, REAR };
    
    
    public int getSeats( ) {
	return seats;
    }

    
    public void setSeats( int seats ) {
	this.seats = seats;
    }


    public boolean hasGPS( ) {
	return hasGPS;
    }


    public void setHasGPS( boolean hasGPS ) {
	this.hasGPS = hasGPS;
    }


    public double getEngineSize( ) {
	return engineSize;
    }


    public void setEngineSize( double engineSize ) {
	this.engineSize = engineSize;
    }
    
    
    public FuelType getFuel( ) {
	return fuel;
    }


    public void setFuel( FuelType fuel ) {
	this.fuel = fuel;
    }


    public GearType getGearType( ) {
	return gear;
    }


    public void setGearType( GearType gear ) {
	this.gear = gear;
    }


    public DriveType getDrive( ) {
	return drive;
    }


    public void setDrive( DriveType drive ) {
	this.drive = drive;
    }
    
    
    public String toString( ) {
	StringBuilder theCar = new StringBuilder( );
	
	theCar.append( "Number of Seats: " );
	theCar.append( this.seats );
	theCar.append( " Has GPS: " );
	theCar.append( this.hasGPS );
	theCar.append( " Engine Size: " );
	theCar.append( this.engineSize );
	theCar.append( " Fuel Type: " );
	theCar.append( this.fuel );
	theCar.append( " Gear Type: " );
	theCar.append( this.gear );
	theCar.append( " Drive Type: " );
	theCar.append( this.drive );
	
	return theCar.toString( );
    }
}
