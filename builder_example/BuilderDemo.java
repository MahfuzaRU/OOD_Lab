//package builder_example;

import java.util.Scanner;

public class BuilderDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MealBuilder builder = new MealBuilder();

        System.out.println("choose burger(veg / chicken ) : ");
        String burger = sc.nextLine();

        System.out.println("choose drink (coke / pepsi ) : ");
        String coldrink = sc.nextLine();

        Meal meal = builder.preparMeal(burger, coldrink);

        System.out.println("\nyour meal");
        meal.showItems();;
        System.out.println("total cost : " + meal.getCost());

        sc.close();
    }
}
