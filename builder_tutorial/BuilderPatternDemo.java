public class BuilderPatternDemo {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal : ");
        vegMeal.showItems();
        System.out.println("total cost : " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNonVeg Meal : ");
        nonVegMeal.showItems();
        System.out.println("total cost : " + nonVegMeal.getCost());
    }
}


/*
Simulate a meal ordering system where different types of meals (e.g., vegetarian and non-vegetarian) are constructed using the Builder Design Pattern. A typical meal consists of a burger and a cold drink.

The burger can be either a Veg Burger or a Chicken Burger, and it is packed using a wrapper.

The cold drink can be either a Coke or a Pepsi, and it is packed in a bottle.

Use the Builder Pattern to encapsulate the logic for constructing these meals step-by-step.

Your program should:

Display both vegetarian and non-vegetarian meals with the list of items included.

Show the total cost of each meal.

Draw a UML class diagram representing the system's structure.

Item (interface)
 ├── Burger (abstract)
 │    ├── VegBurger
 │    └── ChickenBurger
 ├── ColdDrink (abstract)
 │    ├── Coke
 │    └── Pepsi

Meal
MealBuilder
BuilderPatternDemo (main)


*/