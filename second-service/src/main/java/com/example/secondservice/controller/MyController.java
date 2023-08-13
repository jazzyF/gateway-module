package com.example.secondservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rs/api")
public class MyController {

    @RequestMapping("/bye")
    public String sayGoodBye() {
        return "bye from second service";
    }

}
