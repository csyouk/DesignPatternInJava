package com.ism.TightlyCoupled;

/**
 * Created by YOUK on 2017-03-24.
 */
public class EmailService {
    public void sendEmail(String msg, String receiver){
        System.out.println("msg : " + msg + " / Sent to : " + receiver);
    }
}
