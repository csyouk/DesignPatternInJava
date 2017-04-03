package com.ism.StructuralDesignPattern.AdapterDesignPattern;

/**
 * Created by YOUK on 2017-03-30.
 */
public class Socket {
    public Volt getVolt(){
        return new Volt(120);
    }
}
