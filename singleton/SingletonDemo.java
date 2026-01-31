//package singleton;

import java.util.Scanner;

public class SingletonDemo {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter msg : ");
    String msg = sc.nextLine();
    SingleObject object = SingleObject.getInstance();
    object.showMessage(msg);
    sc.close();
   }


}
