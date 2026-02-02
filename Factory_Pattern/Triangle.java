
public class Triangle implements Shape {
    private double a, b, c;
    public Triangle(){
        this.a = 3.0;
        this.b = 4.0;
        this.c = 5.0;
    }
    public double getArea(){
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
