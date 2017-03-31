package com.ism.ChainOfResponsibility;

/**
 * Created by YOUK on 2017-03-29.
 */
public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}
