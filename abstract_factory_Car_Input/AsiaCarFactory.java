

public class AsiaCarFactory extends CarFactory {
    public Car createSmallCar(){
        return new AsiaSmallCar();
    }
    public Car createSedanCar(){
        return new AsiaSedanCar();
    }
    public Car createLuxuryCar(){
        return new AsiaLuxuryCar();
    }
}
