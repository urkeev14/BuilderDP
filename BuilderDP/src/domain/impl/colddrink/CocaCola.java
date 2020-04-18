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
public class CocaCola extends ColdDrink{

    @Override
    public float price() {
        return 100.0f;
    }

    @Override
    public String name() {
        return "Coca Cola";
    }
    
}
