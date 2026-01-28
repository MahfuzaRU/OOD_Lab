//package factory_input;

public class ShapeFactory {

    public Shape getShape(String type, double... values){

        if (type.equalsIgnoreCase("circle")) {
            return new Circle(values[0]);
        }else if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle(values[0], values[1]);
        }else if (type.equalsIgnoreCase("triangle")) {
            return new Triangle(values[0], values[1], values[2]);
        }


        return null;
    }
}
