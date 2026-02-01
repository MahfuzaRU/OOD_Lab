

import java.util.Scanner;

public class AbstractDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter region (usa / asia) : ");
        String region = sc.nextLine();

        System.out.println("enter car typr (small / sedan / luxury) : ");
        String type = sc.nextLine();

        CarFactory factory = FactoryProducer.getFactory(region);
        Car car = null;
        if(type.equalsIgnoreCase("SMALL")){
            car = factory.createSmallCar();
        }
        else if(type.equalsIgnoreCase("SEDAN")){
            car = factory.createSedanCar();
        }
        else if(type.equalsIgnoreCase("LUXURY")){
            car = factory.createLuxuryCar();
        }

        if(car != null){
            car.assemble();;
        }
        else{
            System.out.println("invalid");
        }

        sc.close();
    }
}
