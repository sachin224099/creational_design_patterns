package creational.design.abstract_factory_pattern;

import creational.design.factory_pattern.CarType;

public class SmallCar extends Car {
	 
    public SmallCar(Location location) {
        super(CarType.SMALL, location);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building small car");
        // add accessories
    }
}
