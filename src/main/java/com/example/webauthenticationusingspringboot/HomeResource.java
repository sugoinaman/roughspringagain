package com.example.webauthenticationusingspringboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String home(){
        return ("WELCOME");
    }
     @GetMapping("/user")
    public String user(){
        return ("WELCOME");
    }
     @GetMapping("/admin")
    public String admin(){
        return ("WELCOME");
    }

}
