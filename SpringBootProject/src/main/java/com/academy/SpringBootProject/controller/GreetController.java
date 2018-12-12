package com.academy.SpringBootProject.controller;

import com.academy.SpringBootProject.service.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @Autowired
    private GreetService greetService;

    @GetMapping("/greet")
    public String greet(@RequestParam(value = "name") String name) {
        return greetService.reverseName(name);
    }

}
