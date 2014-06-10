package pattern.builder.after;

public class CarMaker {
    private final CarBuilder builder;

    public CarMaker( CarBuilder builder)
    {
        this.builder = builder;
    }

    public void buildCar( )
    {
	builder.createNewCar( );
        builder.addSeats( );
        builder.applyTypes( );
        builder.setNavigation( );
    }

    public Car getCar( )
    {
        return builder.getCar( );
    }
}
