//package Q1_factory_pattern;

public class Triangle implements Shape {

    private double a, b, c;

    public Triangle(){
        a = 3.0;
        b = 4.0;
        c = 5.0;
    }

    @Override
    public double getArea(){
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

}
