//package factory_method;

public class FactoryPatternDemo {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of circle and call its draw method
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of circle
        shape1.draw();

        //get an object of Square and call its draw method
        Shape shape2 = shapeFactory.getShape("SQUARE");

        //call draw method of square
        shape2.draw();

        //get an object of Rectangle and call its draw method
        Shape shape3 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Rectangle
        shape3.draw();

    }
}


class ShapeFactory {

    //use getshape method to get object of type shape
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }

        else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }

        return null;
    }
}


interface Shape {

    void draw();

    double getArea();
}

class Rectangle implements Shape {

    @Override
    public void draw(){
        System.out.println("Inside Rectangle::draw() method.");
    }
}

class Circle implements Shape {

    @Override
    public void draw(){
        System.out.println("Inside Circle::draw() method.");
    }
}

class Square implements Shape {

    @Override
    public void draw(){
        System.out.println("Inside Square::draw() method.");
    }
}