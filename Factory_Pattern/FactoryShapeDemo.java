
public class FactoryShapeDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("CIRCLE");
        System.out.println("Circle Area : " + circle.getArea());

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        System.out.println("Rectangle Area : " + rectangle.getArea());

        Shape triangle = shapeFactory.getShape("TRIANGLE");
        System.out.println("Triangle Area : " + triangle.getArea());
    }
}


