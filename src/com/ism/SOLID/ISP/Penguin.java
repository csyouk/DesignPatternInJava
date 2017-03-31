package com.ism.SOLID.ISP;

/**
 * Created by YOUK on 2017-03-26.
 */
public class Penguin implements Bird {

    @Override
    public void sing() {
        System.out.println("penguin sing");
    }

    @Override
    public void eat() {
        System.out.println("penguin eat");
    }
}
