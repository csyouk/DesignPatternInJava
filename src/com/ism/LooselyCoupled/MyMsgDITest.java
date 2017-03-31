package com.ism.LooselyCoupled;

/**
 * Created by YOUK on 2017-03-24.
 */
public class MyMsgDITest {

    public static void main(String[] args){
        String msg = "Hi Pankaj";
        String email = "pankaj@abc.com";
        String phone = "4088888888";
        MessageServiceInjector injector = null;
        Consumer app = null;

        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessage(msg, email);

        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessage(msg, phone);
    }
}
