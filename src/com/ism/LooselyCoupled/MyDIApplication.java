package com.ism.LooselyCoupled;

/**
 * Created by YOUK on 2017-03-24.
 */
public class MyDIApplication implements Consumer {
    private MessageService service;

    public MyDIApplication(MessageService service){
        this.service = service;
    }

    @Override
    public void processMessage(String msg, String rec){
        this.service.sendMessage(msg, rec);
    }
}
