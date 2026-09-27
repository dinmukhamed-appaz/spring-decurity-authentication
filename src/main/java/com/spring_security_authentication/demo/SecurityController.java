package com.spring_security_authentication.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SecurityController {

    @GetMapping("/public/hello")
    public String publicHello(){
        return "public Hello World";
    }

    @GetMapping("/private/hello")
    public String protectedHello(){
        return "private Hello World";
    }
}
