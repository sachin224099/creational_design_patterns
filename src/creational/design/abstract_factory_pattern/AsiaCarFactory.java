package creational.design.abstract_factory_pattern;

import creational.design.factory_pattern.CarType;
import creational.design.abstract_factory_pattern.LuxuryCar;
import creational.design.abstract_factory_pattern.SedanCar;
import creational.design.abstract_factory_pattern.SmallCar;

public class AsiaCarFactory
{
  public static Car buildCar(CarType model)
  {
    Car car = null;
    switch (model)
    {
      case SMALL:
      car = new SmallCar(Location.ASIA);
        System.out.println("Test");
      break;
 
      case SEDAN:
      car = new SedanCar(Location.ASIA);
      break;
 
      case LUXURY:
      car = new LuxuryCar(Location.ASIA);
      break;
 
      default:
      //throw some exception
      break;
    }
    return car;
  }
}