//package Q1_factory_pattern;

public class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(){
        width = 2.0;
        height = 1.5;
    }

    @Override
    public double getArea(){
        return width*height;
    }
}
