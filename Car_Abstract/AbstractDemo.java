

public class AbstractDemo {
    public static void main(String[] args) {
        CarFactory usaFactory = FactoryProducer.getFactory("USA");
        usaFactory.createSmallCar().assemble();
        usaFactory.createSedanCar().assemble();
        usaFactory.createLuxuryCar().assemble();

        System.out.println();

        CarFactory asiaFactory =  FactoryProducer.getFactory("ASIA");
        asiaFactory.createSmallCar().assemble();
        asiaFactory.createSedanCar().assemble();
        asiaFactory.createLuxuryCar().assemble();
    }

}
