package pattern.builder.after;

public abstract class CarBuilder {
    protected Car car;
    
    public Car getCar( ) {
	return this.car;
    }
    
    
    public void createNewCar( ) {
	car = new Car( );
    }
    
    public abstract void addSeats( );
    public abstract void applyTypes( );
    public abstract void setNavigation( );
}
