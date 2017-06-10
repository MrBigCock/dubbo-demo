package com.mor.client.dubbo.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mor.server.dubbo.service.DemoServer;

public class DubboClient {
    /**
     * 
     * @author wanggengqi
     * @date 2014年10月23日 下午3:13:04
     */
    public void sayHello() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationConsumer.xml" });
        context.start();
        DemoServer demoServer = (DemoServer) context.getBean("demoService");
        String msg = new SimpleDateFormat("HHMMss").format(new Date());
        demoServer.sayHello(msg);
        System.err.println("Client sending : " + msg);
    }

}
