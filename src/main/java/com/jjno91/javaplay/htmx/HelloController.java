package com.jjno91.javaplay.htmx;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "<p>Hello from Spring!</p>";
    }
}