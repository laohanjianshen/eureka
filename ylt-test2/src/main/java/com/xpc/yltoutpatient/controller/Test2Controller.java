package com.xpc.yltoutpatient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test2Controller {
    @RequestMapping("zp")
    public String zp(){
        return " :zp";
    }
}
