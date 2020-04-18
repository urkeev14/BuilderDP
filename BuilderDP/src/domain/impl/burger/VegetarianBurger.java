/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.impl.burger;

import domain.Burger;

/**
 *
 * @author urosv
 */
public class VegetarianBurger extends Burger{

    @Override
    public float price() {
        return 150.0f;
    }

    @Override
    public String name() {
        return "Vegetarian Burger";
    }
    
}
