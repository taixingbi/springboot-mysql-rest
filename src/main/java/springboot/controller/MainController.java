package springboot.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MainController {
    @RequestMapping("/")
    public String index( ) {
        return "Hey Springboot, This is Mysql Rest!";
    }
}
