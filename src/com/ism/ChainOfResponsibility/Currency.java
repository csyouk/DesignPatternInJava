package com.ism.ChainOfResponsibility;

/**
 * Created by YOUK on 2017-03-28.
 */
public class Currency {

    private int amout;

    public Currency(int amt){
        this.amout = amt;
    }

    public int getAmount(){
        return this.amout;
    }

}
