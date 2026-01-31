//package abstract_factory;

public class AbstractFactoryDemo  {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = Factoryproducer.geFactory(false);

        Shape shape1 = shapeFactory.getShape("rectangle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("square");
        shape2.draw();

        AbstractFactory shapFactory1 = Factoryproducer.geFactory(true);

        Shape shape3 = shapFactory1.getShape("rectangle");
        shape3.draw();

        Shape shape4 = shapFactory1.getShape("square");
        shape4.draw();
    }
}
