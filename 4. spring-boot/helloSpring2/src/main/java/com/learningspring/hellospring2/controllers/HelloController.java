package com.learningspring.hellospring2.controllers;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/header")
    public String getHeader(@RequestHeader String name) {
        return "Header(name): " + name;
    }

    @GetMapping("/allheaders")
    public Map<String, String> getAllHeaders(@RequestHeader Map<String, String> headers) {
        return headers;
    }

    @GetMapping("/addresponseheader")
    public void addingHeader(
                                               @RequestHeader Map<String, String> headers,
                                               HttpServletResponse response
                                            ) {


        response.addHeader("name", "John Wick");
    }
}
