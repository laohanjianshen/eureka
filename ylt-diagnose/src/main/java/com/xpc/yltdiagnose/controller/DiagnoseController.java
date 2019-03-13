package com.xpc.yltdiagnose.controller;

import com.xpc.yltdiagnose.client.TestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiagnoseController {
    @Autowired
    TestClient testClient;

    @GetMapping("/girl")
    public String getDiagnose() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String msg = testClient.getDemo();
        System.out.println("msg:" + msg);
        return "this is dianose:" + msg;
    }
}
