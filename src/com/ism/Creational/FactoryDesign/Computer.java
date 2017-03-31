package com.ism.CreationalDesignPattern.FactoryDesign;

/**
 * Created by YOUK on 2017-03-30.
 */
public abstract class Computer {
    public abstract String getRAM();

    public abstract String getHDD();

    public abstract String getCPU();

    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}