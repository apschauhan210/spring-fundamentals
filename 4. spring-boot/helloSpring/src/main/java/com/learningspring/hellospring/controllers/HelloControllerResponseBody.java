package com.learningspring.hellospring.controllers;

import com.learningspring.hellospring.dot.Person;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController   //  @RestController => @Controller + @ResponseBody(return the body itself from the method)
@RequestMapping(path = "/")
public class HelloControllerResponseBody {

    @GetMapping("hello")
    public String hello() {
        return "Hello as the body";
    }

    @GetMapping("hello/{name}")
    public String helloName(@PathVariable("name") String name) {
        return "Hello " + name + " 🤗 ";
    }

    @PostMapping("hello")
    public String helloNameBody(@RequestBody() Person person) {
        return "Hello " + person.getName() + " 🤗 ";
    }

    @GetMapping("/getpersons")
    public List<Person> getPersons() {
        Person a = new Person("Ana De Arams");
        Person b = new Person("Chris Evans");
        return List.of(a, b);
    }

    @GetMapping("/getperson")
    public Person getPerson(HttpServletResponse response) {
        Person a = new Person("Ana De Arams");
        response.setStatus(HttpServletResponse.SC_ACCEPTED);
        return  a;
    }

    @GetMapping("getAPS")
    public ResponseEntity<Person> get() {
        Person a = new Person("Anuj Pratap Singh");
        return new ResponseEntity<>(a, HttpStatus.ACCEPTED);
    }
}
