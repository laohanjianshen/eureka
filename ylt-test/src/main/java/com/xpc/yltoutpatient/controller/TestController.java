package com.xpc.yltoutpatient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestRepositroy testRepositroy;

    @RequestMapping("test")
    public Object test() {
        return testRepositroy.findAll();
    }
}
