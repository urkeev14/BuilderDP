/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.impl.meal;

import domain.impl.burger.ChickenBurger;
import domain.impl.burger.VegetarianBurger;
import domain.impl.colddrink.CocaCola;
import domain.impl.colddrink.Pepsi;

/**
 *
 * @author urosv
 */
public class MealBuilder {
    
    public Meal prepareVegetarianMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegetarianBurger());
        meal.addItem(new CocaCola());
        return meal;
    }
    
    
    public Meal prepareNonVegetarianMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
    
}
