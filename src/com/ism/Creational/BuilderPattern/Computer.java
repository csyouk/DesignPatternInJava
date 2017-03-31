package com.ism.CreationalDesignPattern.BuilderPattern;

/**
 * Created by YOUK on 2017-03-30.
 */
public class Computer {
    private String HDD;
    private String RAM;

    private boolean isGraphicCardEnabled;
    private boolean isBluetoothEnabled;
    private boolean isPowerOn;

    public String getHDD(){
        return this.HDD;
    }

    public String getRAM(){
        return this.RAM;
    }

    public boolean isPowerOn(){
        return this.isPowerOn;
    }

    public boolean isGraphicCardEnabled(){
        return this.isGraphicCardEnabled;
    }

    public boolean isBluetoothEnabled(){
        return this.isBluetoothEnabled;
    }

    private Computer(ComputerBuilder builder){
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicCardEnabled = builder.isGraphicCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.isPowerOn = builder.isPowerOn;
    }

    public static class ComputerBuilder{

        // required parameters
        private String HDD;
        private String RAM;

        // optional parameters
        private boolean isGraphicCardEnabled;
        private boolean isBluetoothEnabled;
        private boolean isPowerOn;

        public ComputerBuilder(String hdd, String ram){
            this.HDD = hdd;
            this.RAM = ram;
        }

        public ComputerBuilder setGraphicCardEnabled(boolean isGraphicsCardEnabled){
            this.isGraphicCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled){
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public ComputerBuilder setPowerOn(boolean isPowerOn){
            this.isPowerOn = isPowerOn;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

    @Override
    public String toString(){
        return "is graphic card enabled ? " + this.isGraphicCardEnabled
                + "\nis bluetooth enabled ? " + this.isBluetoothEnabled
                + "\nis power on ? " + this.isPowerOn;
    }
}
