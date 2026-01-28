//package factory_input;

import java.util.Scanner;

public class FactoryDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ShapeFactory factory = new ShapeFactory();

        System.out.print("enter shape (circle/ rectangle/ triangle) : ");
        String shapeType = sc.nextLine();

        Shape shape = null;

        if(shapeType.equalsIgnoreCase("circle")){
            System.out.print("enter radius : ");
            double r = sc.nextDouble();

            shape = factory.getShape("circle", r);
        }

        else if (shapeType.equalsIgnoreCase("rectangle")) {
            System.out.print("enter width : ");
            double w = sc.nextDouble();

            System.out.print("enter height : ");
            double h = sc.nextDouble();

            shape = factory.getShape("rectangle", w, h);
        }

        else if(shapeType.equalsIgnoreCase("triangle")){
            System.out.print("enter a : ");
            double a = sc.nextDouble();

            System.out.print("enter b : ");
            double b = sc.nextDouble();

            System.out.print("enter c : ");
            double c = sc.nextDouble();

            shape = factory.getShape("triangle", a, b, c);
        }

        if(shape != null){
            System.out.println("area = "+ shape.getArea());
        }else{
            System.out.println("invalid shape.");
        }

        sc.close();
    }
}
