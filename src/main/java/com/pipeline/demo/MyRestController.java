package com.pipeline.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @GetMapping("/check")
    public String hello() {
        return "Hello from ghosts!";
    }
}
