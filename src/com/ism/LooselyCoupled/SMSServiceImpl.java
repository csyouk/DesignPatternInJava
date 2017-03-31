package com.ism.LooselyCoupled;

/**
 * Created by YOUK on 2017-03-24.
 */
public class SMSServiceImpl implements MessageService{

    @Override
    public void sendMessage(String msg, String rec){
        System.out.println("SMS sent to "+rec+ " with Message="+msg);
    }
}
