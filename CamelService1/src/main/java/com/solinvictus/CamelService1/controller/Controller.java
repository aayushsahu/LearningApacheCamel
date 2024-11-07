package com.solinvictus.CamelService1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @GetMapping(value = "/test")
    public String testAPI() {
        return "TESTAPI was called successfully";
    }
}
