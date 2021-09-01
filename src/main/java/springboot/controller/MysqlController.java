package springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springboot.model.User;
import springboot.repository.UserRepository;


@RestController
public class MysqlController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody User addNewUser (@RequestBody User user) {
        User n = new User();
        n.setName(user.getName());
        n.setEmail(user.getEmail());
        userRepository.save(n);
        return user;
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
