package creational.design.abstract_factory_pattern;

import creational.design.factory_pattern.CarType;

public class LuxuryCar extends Car
{
  public LuxuryCar(Location location)
  {
    super(CarType.LUXURY, location);
    construct();
  }
 
  @Override
  protected void construct() {
    System.out.println("Building luxury car");
    //add accessories
  }
}
