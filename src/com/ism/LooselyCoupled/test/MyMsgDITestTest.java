package com.ism.LooselyCoupled.test;

import com.ism.LooselyCoupled.Consumer;
import com.ism.LooselyCoupled.MessageService;
import com.ism.LooselyCoupled.MessageServiceInjector;
import com.ism.LooselyCoupled.MyDIApplication;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by YOUK on 2017-03-24.
 */
public class MyMsgDITestTest extends TestCase {

    private MessageServiceInjector injector;

    @Before
    public void setUp(){
        injector = new MessageServiceInjector() {
            @Override
            public Consumer getConsumer() {
                return new MyDIApplication(new MessageService() {
                    @Override
                    public void sendMessage(String msg, String rec) {
                        System.out.println("Mock msg");
                    }
                });
            }
        };
    }

    @Test
    public void test(){
        Consumer consumer = injector.getConsumer();
        consumer.processMessage("Hi", "dd@dd.ff");
    }

    @After
    public void tear(){
        injector = null;
    }

}