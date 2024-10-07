package com.example.docker01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello")
    public HelloResponse sayHi() {
        return new HelloResponse("Helloooo Spring Boot");
    }

}
