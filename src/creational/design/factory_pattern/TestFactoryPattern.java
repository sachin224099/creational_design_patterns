package creational.design.factory_pattern;

public class TestFactoryPattern {
    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.SMALL).getModel());
        System.out.println(CarFactory.buildCar(CarType.SEDAN).getModel());
        System.out.println(CarFactory.buildCar(CarType.LUXURY).getModel());
    }
}
