/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.impl.packing;

import domain.Packing;

/**
 *
 * @author urosv
 */
public class Wrapper implements Packing{

    @Override
    public String pack() {
        return "Wrapper";
    }
    
}
