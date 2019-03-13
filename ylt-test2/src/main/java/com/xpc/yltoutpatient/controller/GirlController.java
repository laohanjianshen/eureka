package com.xpc.yltoutpatient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GirlController {
    @Autowired
    private GirlPropertie girlPropertie;
    @RequestMapping("/girl")
    public String girl() {
        return "name:" + girlPropertie.getName() + " age:" + girlPropertie.getAge();
    }
}
