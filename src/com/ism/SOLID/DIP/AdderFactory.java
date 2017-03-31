package com.ism.SOLID.DIP;

/**
 * Created by YOUK on 2017-03-27.
 */
public class AdderFactory {
    public enum AdderType{
        NORMAL,
        X2
    }

    public static IAdder create(AdderType type){
        switch (type){
            case NORMAL: return new Adder();
            case X2: return new Adder();
            default:
                throw new IllegalArgumentException();
        }
    }
}
