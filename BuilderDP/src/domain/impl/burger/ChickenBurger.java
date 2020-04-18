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
public class ChickenBurger extends Burger{

    @Override
    public float price() {
        return 200.0f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
    
}
