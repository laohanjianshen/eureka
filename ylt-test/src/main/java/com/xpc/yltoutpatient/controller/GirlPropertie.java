package com.xpc.yltoutpatient.controller;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "girl")
@RefreshScope
@Component
public class GirlPropertie {
    private String name;
    private Integer age;
}
