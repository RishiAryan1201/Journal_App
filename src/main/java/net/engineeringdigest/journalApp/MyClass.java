package net.engineeringdigest.journalApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyClass {

    
    @GetMapping("abc")
    public String sayHello() {
        return "this is my first page i ever build this is a trial";
    }
}
