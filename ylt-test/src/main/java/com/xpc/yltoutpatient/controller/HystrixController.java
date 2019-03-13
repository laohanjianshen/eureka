package com.xpc.yltoutpatient.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.xpc.yltoutpatient.client.DiagnoseClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {
    @Autowired
    private DiagnoseClient diagnoseClient;

    @RequestMapping("/hystrixDiagnose")
    @HystrixCommand(commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")
    })
    public String hystrixDiagnose(@RequestParam("num")Integer num) {
        if (num % 2 ==0){
            return "success";
        }
        return diagnoseClient.getDiagnose();
    }

    public String fb() {
        return "太拥挤了,请稍后再试";
    }

    public String fba() {
        return "fba:太拥挤了,请稍后再试";
    }

//    @RequestMapping("/fbahystrixDiagnose")
//    @HystrixCommand
//    public String fbahystrixDiagnose() {
//        return diagnoseClient.getDiagnose();
//    }
}
