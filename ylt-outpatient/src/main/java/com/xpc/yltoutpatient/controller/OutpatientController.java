package com.xpc.yltoutpatient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OutpatientController {
    @GetMapping("/outpatient")
    public String getOutpatient() {
        return "this is outpatient";
    }
}
