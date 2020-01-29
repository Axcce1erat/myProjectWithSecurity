package com.wildcodeschool.myProjectWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWoldController {

    @GetMapping("/")
    public String hello(){
        return "Welcome to SHIELD";
    }

    @GetMapping("/avangers/assemble")
    public String assemble() {
        return "Avengers..... Assemble!!!";
    }

    @GetMapping("/secret-bases")
    public String bases() {
        return "Darmstadt, Bonn, France";
    }
}
