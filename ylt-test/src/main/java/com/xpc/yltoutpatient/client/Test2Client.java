package com.xpc.yltoutpatient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "test2")
public interface Test2Client {
    @RequestMapping("zp")
    String getZp();
}
