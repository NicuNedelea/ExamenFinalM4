package ro.tefacprogramator.m4.greeting.controller;

import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ro.tefacprogramator.m4.greeting.entity.Greeting;
import ro.tefacprogramator.m4.greeting.service.GreetingService;

@RestController
@CrossOrigin
public class GreetingController {
    
    @Autowired
    private GreetingService greetingService;

    @GetMapping("/")
    public String homepage() {
        return "Hello";
    }

    @PostMapping("/greeting/add")
    public Map<String, Object> addSeries(@RequestBody Greeting g1) {

        if (greetingService.verifyForEmptyFields(g1)){
            return Collections.singletonMap("Greeting saved", true);
        }
        return Collections.singletonMap("Greeting saved", false);        
    }

    @GetMapping("/greeting/getAll")
    public Object getAll() {
        return greetingService.getAll();        
    }
}
