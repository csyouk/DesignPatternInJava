package com.ism.SOLID.LSP;

/**
 * Created by YOUK on 2017-03-26.
 */
public class Square extends Rectangle{
    @Override
    public void setWidth(double width){
        this.width = width;
        this.height = width;
    }

    @Override
    public void setHeight(double height){
        this.width = height;
        this.height = height;
    }
}
