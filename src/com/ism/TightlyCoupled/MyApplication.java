package com.ism.TightlyCoupled;

/**
 * Created by YOUK on 2017-03-24.
 */
public class MyApplication {

    private EmailService email = new EmailService();


    public void processMessages(String msg, String rec){
        this.email.sendEmail(msg, rec);
    }
}
