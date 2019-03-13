package com.xpc.yltdiagnose.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "test")
public interface TestClient {
    @RequestMapping("girl")
    String getDemo();
}
