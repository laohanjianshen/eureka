package com.xpc.yltoutpatient.controller;

import com.xpc.yltoutpatient.client.Test2Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GirlController {
    @Autowired
    private GirlPropertie girlPropertie;
    @Autowired
    private Test2Client test2Client;
    @RequestMapping("/girl")
    public String girl() {
        return "name:" + girlPropertie.getName() + " age:" + girlPropertie.getAge()+test2Client.getZp();
    }
}
