
public class Rectangle implements Shape {
    private double width;
    private double height;
    public Rectangle(){
        this.width = 3.0;
        this.height = 4.0;
    }
    public double getArea(){
        return width*height;
    }
}
