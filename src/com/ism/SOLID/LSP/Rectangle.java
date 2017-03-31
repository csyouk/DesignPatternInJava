package com.ism.SOLID.LSP;

/**
 * Created by YOUK on 2017-03-26.
 */
public class Rectangle {
    protected double width;
    protected double height;

    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return this.width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return this.height;
    }
    public double getArea() {
        return this.getWidth() * this.getHeight();
    }

}
