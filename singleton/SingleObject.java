//package singleton;

public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject(){}
    public static SingleObject getInstance (){
        return instance;
    }
    public void showMessage(String message){
        System.out.println("Message : " + message);
    }
}











/*
public class SingleObject {

     // create single object
    private static SingleObject instance = new SingleObject();

    // private constructor
    private SingleObject(){}

     // global access point
    public static SingleObject getInstance(){
        return instance;
    }

    // method using keyboard input
    public void showMessage(String message){
        System.out.println("Message : " + message);
    }

}

*/
