package com.xpc.yltoutpatient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "test")
public interface TestClient {
    @RequestMapping("/outpatient")
    String getTest();
}
