// package abstract_factory;

public class Factoryproducer {
    public static AbstractFactory geFactory(boolean rounded){
        if(rounded){
            return new RoundedShapeFactory();
        }
        else{
            return new ShapeFactory();
        }
    }
}
