package com.xpc.test.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 使用RestTemplate 方式调用的三种方法.
 */
@RestController
public class RestTemplateController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;
//    @Autowired
//    private RestTemplate restTemplate;
    @RequestMapping("/diagnose")
    public String getDiagnose(){
        //方式一,直接写死url,Low.
//        RestTemplate restTemplate = new RestTemplate();
//        String response = restTemplate.getForObject("http://localhost:8086/diagnose",String.class);
//        方式二,使用LoadBlancerClient动态获取url
        RestTemplate restTemplate = new RestTemplate();
        ServiceInstance serviceInstance = loadBalancerClient.choose("ylt-diagnose");
        String url = String.format("http://%s:%s",serviceInstance.getHost(),serviceInstance.getPort()+"/diagnose");
        //方式三,配置RestTemplate Bean方式.
        String response = restTemplate.getForObject(url,String.class);
//        String response = restTemplate.getForObject("http://ylt-diagnose/diagnose",String.class);
//        System.out.println(response);
        return response;
    }
}
