package com.ism.SOLID.OCR;

import sun.security.provider.SHA;

/**
 * Created by YOUK on 2017-03-26.
 */
public class Circle implements Shape{
    public double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    @Override
    public double getArea() {
        return this.getRadius() * this.getRadius() * Math.PI;
    }

}
