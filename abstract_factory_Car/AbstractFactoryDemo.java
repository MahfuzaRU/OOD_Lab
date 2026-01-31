

public class AbstractFactoryDemo {

        public static void main(String[] args) {

            CarFactory usaFactory = FactoryProducer.getFactory("USA");
            usaFactory.createSmallerCar().showSpecification();
            usaFactory.createSedanCar().showSpecification();

            System.out.println();

            CarFactory asiaFactory = FactoryProducer.getFactory("ASIA");
            asiaFactory.createLuxuryCar().showSpecification();
        }
}

/*
        Car
        +showSpecification()
           ▲
           |
 ----------------------------
 |          |               |
UsaSmall  AsiaSmall     UsaSedan ...
 
        CarFactory
  +createSmallCar()
  +createSedanCar()
  +createLuxuryCar()
           ▲
     ---------------- 
     |              |
UsaCarFactory   AsiaCarFactory

*/
