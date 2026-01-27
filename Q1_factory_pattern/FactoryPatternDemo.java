//package Q1_factory_pattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape Circle = shapeFactory.getShape("CIRCLE");
        System.out.println("Circle Area : " + Circle.getArea());

        Shape Rectangle = shapeFactory.getShape("RECTANGLE");
        System.out.println("Rectangle Area : " + Rectangle.getArea());

        Shape Triangle = shapeFactory.getShape("TRIANGLE");
        System.out.println("Triangle Area : " + Triangle.getArea());

    }

}




/*public class problem: 1

Write a program to create various shapes like (Circle, Triangle, Rectangle) and calculate the area of 
the shape. You should use Factory Pattern for shape creation so that all shapes can be created using 
a single factory object.

Each shape should have their defining properties (For example circle should have radius, triangle 
should have length of its three side etc.) and a method named getArea() to calculate the area of the 
shape.

When creating a particular shape, you should initialize the shapes property with any default values 
(ie. for circle, redius =1; for rectangle width =2 and height=1.5 etc.)
 {

    
} */
