package com.learningspring.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HelloControllerTemplate {

    @GetMapping
    public String helloTemplate() {
        return "hello.html";
    }

    @GetMapping("hellotxt")
    public String helloTextFile() {
        return "hello.txt";
    }

    @GetMapping("helloBody")
    @ResponseBody
    public String helloBody() {
        return "Hello from body!!!";
    }

}
