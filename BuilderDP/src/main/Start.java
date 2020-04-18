/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import domain.impl.meal.Meal;
import domain.impl.meal.MealBuilder;

/**
 *
 * @author urosv
 */
public class Start {
    
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        
        Meal vegetarianMeal = mealBuilder.prepareVegetarianMeal();
        System.out.println("Vegetarian Meal");
        vegetarianMeal.showItems();
        System.out.println("Total cost: " + vegetarianMeal.getSumOfCost());
        
        System.out.println("\n\n");
        
        Meal nonVegetarianMeal = mealBuilder.prepareNonVegetarianMeal();
        System.out.println("Non vegetarian Meal");
        nonVegetarianMeal.showItems();
        System.out.println("Total cost: " + nonVegetarianMeal.getSumOfCost());
    }
    
}
