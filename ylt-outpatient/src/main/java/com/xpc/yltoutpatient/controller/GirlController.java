package com.xpc.yltoutpatient.controller;

import com.xpc.yltoutpatient.client.GirlClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GirlController {
    @Autowired
    private GirlClient girlClient;
    @RequestMapping("getGirl")
    public String getGirl(){
        return "测试:"+girlClient.getGirl();
    }
}
