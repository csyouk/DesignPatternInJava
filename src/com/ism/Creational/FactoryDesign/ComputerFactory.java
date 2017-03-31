package com.ism.CreationalDesignPattern.FactoryDesign;

/**
 * Created by YOUK on 2017-03-30.
 * Factory design provides interface rather than implementation.
 */
public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);

        return null;
    }
}
