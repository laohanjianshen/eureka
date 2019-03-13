package com.xpc.yltoutpatient.controller;

import com.xpc.yltoutpatient.client.TestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestRepositroy testRepositroy;
    @Autowired
    private TestClient testClient;

    @RequestMapping("test")
    public Object test() {
        return testClient.getTest();
    }
}
