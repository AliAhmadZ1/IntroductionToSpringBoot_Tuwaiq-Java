package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {


    //- GET /name : returns “My name is .......”
    @GetMapping("/name")
    public String my_name() {
        return "My name is ALi Ahmed Alshehri";
    }

    //- GET /age : returns “My age is ........”
    @GetMapping("/age")
    public String my_age() {
        return "My age is 24";
    }

    //- GET /check/status : returns “Everything OK”
    @GetMapping("/check/status")
    public String my_statu() {
        return "Everything is OK";
    }

    //- GET /health : returns “Server health is up and running”
    @GetMapping("/health")
    public String health() {
        return "Server of spring boot project is perfect";
    }

    //- Get /names : return array of names
    @GetMapping("/names")
    public String[] names() {
        return new String[]{"Ahmed", "Ahmed", "Saeed", "Nawaf"};
    }
}
