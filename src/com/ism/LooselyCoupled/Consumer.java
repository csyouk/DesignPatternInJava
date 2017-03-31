package com.ism.LooselyCoupled;

/**
 * Created by YOUK on 2017-03-24.
 */
public interface Consumer {
    void processMessage(String msg, String rec);
}
