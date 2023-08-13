package com.example.firstservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class FirstController {

    @RequestMapping("/message")
    public String sendMessage() {
        return "hello from first service";
    }

}
