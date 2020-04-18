/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.impl.colddrink;

import domain.ColdDrink;

/**
 *
 * @author urosv
 */
public class Pepsi extends ColdDrink{

    @Override
    public float price() {
        return 101.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
    
}
