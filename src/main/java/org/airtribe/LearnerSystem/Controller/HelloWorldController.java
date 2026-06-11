package org.airtribe.LearnerSystem.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/hello")
    public String helloFunc() {
        return "Hello World From Learner Management System";
    }

}
