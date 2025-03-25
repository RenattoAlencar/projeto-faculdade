package com.faculdade.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class UserController {

    @GetMapping("/search")
    public String test() {
        return "Is Okay!";
    }

}
