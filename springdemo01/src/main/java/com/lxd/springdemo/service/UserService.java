package com.lxd.springdemo.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserService {
    public static void staticMethod() {
        log.info("hello world");
    }

    public void normalMethod() {
        log.info("hello normal");
    }

}
