package com.xpc.yltoutpatient.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface TestRepositroy extends JpaRepository<user, Integer> {
}
