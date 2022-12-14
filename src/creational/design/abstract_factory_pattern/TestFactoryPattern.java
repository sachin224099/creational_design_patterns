package creational.design.abstract_factory_pattern;

import creational.design.factory_pattern.CarType;

public class TestFactoryPattern
{
  public static void main(String[] args)
  {
    System.out.println(CarFactory.buildCar(CarType.SMALL));
    System.out.println(CarFactory.buildCar(CarType.SEDAN));
    System.out.println(CarFactory.buildCar(CarType.LUXURY));
  }
}