package com.xpc.yltoutpatient.controller;

import com.xpc.yltoutpatient.client.DiagnoseClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ClientController {
    @Autowired
    private DiagnoseClient diagnoseClient;

    @GetMapping("/getDiagnose")
    public String getDiagnose() {
        String response = diagnoseClient.getDiagnose();
        log.info("resonse:" + response);
        return response;
    }
}
