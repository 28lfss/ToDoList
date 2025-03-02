package org.lfss.todolist;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@CrossOrigin(origins="*")
public class HelloWorldController {

    @GetMapping("/")
    public String index(){
        return "Greetings from Spring Boot!";
    }
}
