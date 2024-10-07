package com.example.docker01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Value("${auth.server}")
    private String url;

    @GetMapping("/hello")
    public HelloResponse sayHi() {
        return new HelloResponse("Hello Spring Boot", url);
    }

}
