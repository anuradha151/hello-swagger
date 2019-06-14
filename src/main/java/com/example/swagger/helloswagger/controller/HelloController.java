package com.example.swagger.helloswagger.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hello/swag")
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello swagger";
    }

    @PostMapping("/add")
    public String helloAdd(@RequestBody String hello) {
        return hello;
    }

    @PutMapping("/update")
    public String helloUpdate(@RequestBody String hello) {
        return hello;
    }
}
