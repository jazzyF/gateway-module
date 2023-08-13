package com.example.secondservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class SecondController {

    @RequestMapping("/message")
    public String sendMessage() {
        return "hi from second service";
    }

}
