package com.ism.SOLID.OCR;

/**
 * Created by YOUK on 2017-03-26.
 */
public class Triangle implements Shape{

    private double base;
    private double height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double getBase() {
        return this.base;
    }
    public double getHeight() {
        return this.height;
    }

    @Override
    public double getArea() {
        return this.getBase() * this.getHeight() / 2;
    }
}
