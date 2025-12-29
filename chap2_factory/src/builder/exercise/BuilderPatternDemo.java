package builder.exercise;

import builder.exercise.model.Meal;
import builder.exercise.model.MealBuilder;

public class BuilderPatternDemo 
{
	public static void main(String[] args) 
	{
		 MealBuilder mealBuilder = new MealBuilder();

	        System.out.println("Veg Meal");
	        Meal vegMeal = mealBuilder.prepareVegMeal();
	        vegMeal.displayItem();
	        System.out.println("Total Cost: " + vegMeal.getCost());

	        System.out.println("\nNon-Veg Meal");
	        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
	        nonVegMeal.displayItem();
	        System.out.println("Total Cost: " + nonVegMeal.getCost());
		
	}

}
