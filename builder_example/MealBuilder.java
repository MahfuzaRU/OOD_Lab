//package builder_example;

public class MealBuilder {

    public Meal preparMeal(String burgerType, String drinkType){

        Meal meal = new Meal();

        if(burgerType.equalsIgnoreCase("Veg")){
            meal.addItem(new VegBurger());
        }
        else if(burgerType.equalsIgnoreCase("chicken")){
            meal.addItem(new ChickenBurger());
        }

        if(drinkType.equalsIgnoreCase("Pepsi")){
            meal.addItem(new Pepsi());
        }
        else if(drinkType.equalsIgnoreCase("Coke")){
            meal.addItem(new Coke());
        }

        return meal;
    }
}
