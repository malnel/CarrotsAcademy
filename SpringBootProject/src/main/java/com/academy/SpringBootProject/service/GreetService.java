package com.academy.SpringBootProject.service;

import org.springframework.stereotype.Service;

@Service
public class GreetService {

    public String reverseName(String name) {
        String reversedName = "";
        for(int i = name.length() - 1; i >= 0; i--) {
            reversedName += (name.charAt(i) + "");
        }
        return "Hello, " + name + "! Your name backwards is " + reversedName.toUpperCase();
    }
}
