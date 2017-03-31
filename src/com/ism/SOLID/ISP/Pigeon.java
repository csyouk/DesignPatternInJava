package com.ism.SOLID.ISP;

/**
 * Created by YOUK on 2017-03-26.
 */
public class Pigeon implements Bird, FlyableBird {
    @Override
    public void fly(){
        System.out.println("pigeon fly");
    }

    @Override
    public void sing() {
        System.out.println("pigeon sing");
    }

    @Override
    public void eat() {
        System.out.println("pigeon eat");
    }
}
