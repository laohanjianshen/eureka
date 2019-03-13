package com.xpc.yltoutpatient.controller;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class user {
    @Id
    private Integer id;
    private String name;
    private String sex;
}
