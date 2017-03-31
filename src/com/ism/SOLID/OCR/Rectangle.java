package com.ism.SOLID.OCR;

/**
 * Created by YOUK on 2017-03-26.
 */
public class Rectangle implements Shape{

    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }


    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public double getArea(){
        return this.getHeight() * this.getWidth();
    }


}

