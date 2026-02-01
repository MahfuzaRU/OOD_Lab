

public class UsaCarFactory extends CarFactory {
    public Car createSmallCar(){
        return new UsaSmallCar();
    }
    public Car createSedanCar(){
        return new UsaSedanCar();
    }
    public Car createLuxuryCar(){
        return new UsaLuxuryCar();
    }
}
