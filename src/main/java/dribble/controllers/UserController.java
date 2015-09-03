package dribble.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
 
    @RequestMapping("/user")
    public String user(@RequestParam(value="name", defaultValue="World") String name) {
        return "whats up" + name;
    }    
    
}
