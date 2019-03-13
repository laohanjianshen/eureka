package com.xpc.yltoutpatient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "ylt-diagnose",fallback = DiagnoseClient.DiagnoseFallBack.class)
public interface DiagnoseClient {
    @GetMapping("/diagnose")
    String getDiagnose();
    @Component
    static class DiagnoseFallBack implements DiagnoseClient{

        @Override
        public String getDiagnose() {
            return "服务被降级了";
        }
    }
}
