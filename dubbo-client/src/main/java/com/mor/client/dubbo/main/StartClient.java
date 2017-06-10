package com.mor.client.dubbo.main;

import com.mor.client.dubbo.action.DubboClient;

public class StartClient {

    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        while (i++ < 100) {
            DubboClient client = new DubboClient();
            client.sayHello();
            Thread.sleep(3000);
        }
    }

}
