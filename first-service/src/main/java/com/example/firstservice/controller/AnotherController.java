package com.example.firstservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AnotherController {

    @RequestMapping("/bye")
    public String sayGoodBye(@RequestParam("name") String name) {
        return "bye from first service %s".formatted(name);
    }

}
