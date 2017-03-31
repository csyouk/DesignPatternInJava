package com.ism.LooselyCoupled;

/**
 * Created by YOUK on 2017-03-24.
 */
public class SMSServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer(){
        return new MyDIApplication(new EmailServiceImpl());
    }
}
