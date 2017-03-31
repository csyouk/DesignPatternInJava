package com.ism.SOLID.DIP;

/**
 * Created by YOUK on 2017-03-26.
 */
public class Adder implements IAdder {
    @Override
    public double add(double addend, double augend){
        return addend + augend;
    }
}
