package org.learningSpring.services;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hello(String name) throws Exception {
        String res = "Hello " + name;
        System.out.println(res);
//        throw new Exception("Throwing for testing");
        return res;
    }
}
