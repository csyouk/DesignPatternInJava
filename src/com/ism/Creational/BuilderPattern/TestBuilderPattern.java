package com.ism.CreationalDesignPattern.BuilderPattern;

/**
 * Created by YOUK on 2017-03-30.
 */
public class TestBuilderPattern {
    public static void main(String[] args){
        Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB")
                .setGraphicCardEnabled(true)
                .setBluetoothEnabled(true)
                .setPowerOn(true)
                .build();

        System.out.println(comp.toString());
    }
}
